package com.alejandrove.cuidarpokemon.backend;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.helpers.EstadosTypes;
import com.alejandrove.cuidarpokemon.backend.helpers.HelperClass;
import com.alejandrove.cuidarpokemon.backend.helpers.LogTypes;
import com.alejandrove.cuidarpokemon.backend.helpers.PeticionesTypes;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Comida;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Medicina;
import com.alejandrove.cuidarpokemon.frontend.mascota.MascotaFrame;

public class Mascota {

	private int nivel;
	public int precio;
	private String apodo;
	private String estado;
	private ImageIcon sprite;
	private String nombre;
	public HiloPeticion hiloPeticionComida;
	public int segundosPeticionComida;
	private String peticionesComidaString;
	public HiloPeticion hiloPeticionPaseo;
	public int segundosPeticionPaseo;
	private String peticionesPaseoString;
	public MascotaFrame frame;
	private String peticionesLimpiarString;
	private int peticionesLimpiar;
	private int contadorComidasParaExcretar;
	private String peticionesCurarString;
	private int peticionesCurar;
	private Log[] logs;
	private int tiempoMuerte;
	private int cantidadBatallasSiguienteNivel;
	private int batallasRealizadas;
	private Jugador jugador;

	public Mascota(String apodo, ImageIcon sprite, String nombre, Log[] logs, Jugador jugador) {
		this.precio = 50;
		this.segundosPeticionComida = 60;
		this.segundosPeticionPaseo = 120;
		this.peticionesLimpiar = 0;
		this.peticionesCurar = 0;
		this.apodo = apodo;
		this.sprite = sprite;
		this.nombre = nombre;
		this.logs = logs;
		this.frame = null;
		this.jugador = jugador;
		this.tiempoMuerte = 60;
	}

	public void nacer() {
		this.nivel = 0;
		setCantidadBatallasSiguienteNivel();
		this.hiloPeticionComida = new HiloPeticion(5, segundosPeticionComida, PeticionesTypes.comida, this);
		hiloPeticionComida.start();
		hiloPeticionComida.actualizarPeticiones();
		this.hiloPeticionPaseo = new HiloPeticion(4, segundosPeticionPaseo, PeticionesTypes.pasear, this);
		hiloPeticionPaseo.start();
		hiloPeticionPaseo.actualizarPeticiones();
		setPeticiones(PeticionesTypes.limpiar, peticionesLimpiar);
		setPeticiones(PeticionesTypes.curar, peticionesCurar);
		this.estado = EstadosTypes.vivo;
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.nacimiento, this);
	}

	public void pasear(boolean gano) {
		if (peticionesCurar <= 0) {
			hiloPeticionPaseo.reiniciarPeticiones();
			hiloPeticionPaseo.actualizarPeticiones();
			logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.paseo, this);
			if (gano)
				batallar();
		}
	}

	public void subirNivel() {
		nivel++;
		setCantidadBatallasSiguienteNivel();
		batallasRealizadas = 0;
		JOptionPane.showMessageDialog(null, "Tu mascota " + apodo + " ha subido a nivel " + nivel, "Subió nivel",
				JOptionPane.INFORMATION_MESSAGE);
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.nivel, this);
		if (nivel == 5) {
			JOptionPane.showMessageDialog(null,
					"Como tu mascota subió al nivel 5, morirá después de cierto tiempo, podrás revivirla posteriormente",
					"Subió nivel",
					JOptionPane.WARNING_MESSAGE);
			HiloMuerte hiloMuerte = new HiloMuerte(tiempoMuerte, this);
			hiloMuerte.start();
		}
	}

	public void batallar() {
		batallasRealizadas++;
		int randomNumber = (int) Math.floor(Math.random() * (15 - 1 + 1) + 1);
		int dineroGanado = 10 + 20 * nivel + randomNumber;
		jugador.agregarDinero(dineroGanado);
		if (batallasRealizadas == cantidadBatallasSiguienteNivel) {
			subirNivel();
		}
	}

	public void ganarBatallar(Jugador jugador) {
		int randomNumber = (int) Math.floor(Math.random() * (15 - 1 + 1) + 1);
		int dineroAgregado = 10 + (20 * nivel) + randomNumber;
		jugador.agregarDinero(dineroAgregado);
	}

	public void morir() {
		JOptionPane.showMessageDialog(frame,
				"Lamentablemente tu pokemon " + apodo + " de la clase " + nombre + " ha muerto :(", "Pokemon Muerto",
				JOptionPane.WARNING_MESSAGE);
		this.estado = EstadosTypes.muerto;
		hiloPeticionComida.reiniciarPeticiones();
		hiloPeticionComida.actualizarPeticiones();
		hiloPeticionPaseo.reiniciarPeticiones();
		hiloPeticionPaseo.actualizarPeticiones();
		peticionesCurar = 0;
		peticionesLimpiar = 0;
		setPeticiones(PeticionesTypes.curar, peticionesCurar);
		setPeticiones(PeticionesTypes.limpiar, peticionesLimpiar);
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.muerte, this);
	}

	public void comer(Comida comida) {
		comida.accionComida(this);
		hiloPeticionComida.actualizarPeticiones();
		excretar();
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.comida, this);
	}

	public void excretar() {
		if (peticionesCurar <= 0) {
			contadorComidasParaExcretar++;
			if (contadorComidasParaExcretar == 2) {
				contadorComidasParaExcretar = 0;
				peticionesLimpiar++;
				JOptionPane.showMessageDialog(null, "Tú mascota necesita ser limpiada!", "Limpiar mascota",
						JOptionPane.INFORMATION_MESSAGE);
				if (peticionesLimpiar == 3) {
					peticionesLimpiar = 0;
					enfermar();
				}
				setPeticiones(PeticionesTypes.limpiar, peticionesLimpiar);
			}
		}
	}

	public void enfermar() {
		peticionesCurar++;
		setPeticiones(PeticionesTypes.curar, peticionesCurar);
		hiloPeticionPaseo.reiniciarPeticiones();
		hiloPeticionPaseo.actualizarPeticiones();
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.enfermedad, this);
		JOptionPane.showMessageDialog(null, "Tú mascota necesita ser curada!", "Curar mascota",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void curarEnfermedades(int enfermedadesCuradas) {
		this.peticionesCurar -= enfermedadesCuradas;
		if (peticionesCurar < 0)
			peticionesCurar = 0;
	}

	public void curar(Medicina medicina) {
		medicina.curarEnfermedades(this);
		this.hiloPeticionPaseo = new HiloPeticion(4, segundosPeticionPaseo, PeticionesTypes.pasear, this);
		hiloPeticionPaseo.start();
		hiloPeticionPaseo.actualizarPeticiones();
	}

	public void limpiar() {
		setPeticionesLimpiar(0);
		setPeticiones(PeticionesTypes.limpiar, 0);
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.limpieza, this);
	}

	/* SETTERS */

	public void setCantidadBatallasSiguienteNivel() {
		int randomNumber = (int) Math.floor(Math.random() * (15 - 5 + 1) + 5);
		cantidadBatallasSiguienteNivel = randomNumber * nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public ImageIcon getSprite() {
		return sprite;
	}

	public void setFrame(MascotaFrame frame) {
		this.frame = frame;
	}

	public void setPeticiones(String tipo, int peticiones) {
		String mensaje = "peticiones de " + tipo + ": " + peticiones;
		switch (tipo) {
			case PeticionesTypes.comida:
				this.peticionesComidaString = mensaje;
				break;
			case PeticionesTypes.limpiar:
				this.peticionesLimpiarString = mensaje;
				break;
			case PeticionesTypes.curar:
				this.peticionesCurarString = mensaje;
				break;
			case PeticionesTypes.pasear:
				this.peticionesPaseoString = mensaje;
				break;

			default:
				break;
		}
	}

	public void setPeticionesLimpiar(int peticionesLimpiar) {
		this.peticionesLimpiar = peticionesLimpiar;
	}

	/*  */

	/* GETTERS */

	public String getApodo() {
		return apodo;
	}

	public String getEstado() {
		return estado;
	}

	public int getNivel() {
		return nivel;
	}

	public String getPeticionesComidaString() {
		return peticionesComidaString;
	}

	public String getPeticionesLimpiarString() {
		return peticionesLimpiarString;
	}

	public String getPeticionesCurarString() {
		return peticionesCurarString;
	}

	public String getPeticionesPaseoString() {
		return peticionesPaseoString;
	}

	public int getPeticionesCurar() {
		return peticionesCurar;
	}

	/*  */

}
