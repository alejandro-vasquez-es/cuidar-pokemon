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
	private int tiempoMuerte;
	public HiloPeticion hiloPeticionComida;
	public int segundosPeticionComida;
	private String peticionesComidaString;
	public MascotaFrame frame;
	private String peticionesLimpiarString;
	private int peticionesLimpiar;
	private int contadorComidasParaExcretar;
	private String peticionesCurarString;
	private int peticionesCurar;
	private Log[] logs;
	private int cantidadBatallasSiguienteNivel;
	private int batallasRealizadas;

	public Mascota(String apodo, ImageIcon sprite, String nombre, Log[] logs) {
		this.nivel = 1;
		this.precio = 50;
		this.segundosPeticionComida = 7;
		this.hiloPeticionComida = new HiloPeticion(5, segundosPeticionComida, PeticionesTypes.comida, this);
		this.peticionesLimpiar = 0;
		this.peticionesCurar = 0;
		this.nivel = 0;
		this.apodo = apodo;
		this.sprite = sprite;
		this.nombre = nombre;
		this.logs = logs;
		this.frame = null;
	}

	public void nacer() {
		hiloPeticionComida.start();
		hiloPeticionComida.actualizarPeticiones();
		setPeticiones(PeticionesTypes.limpiar, peticionesLimpiar);
		setPeticiones(PeticionesTypes.curar, peticionesCurar);
		this.estado = EstadosTypes.vivo;
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.nacimiento, this);
	}

	public void subirNivel() {
		nivel++;
		int randomNumber = (int) Math.floor(Math.random() * (15 - 5 + 1) + 5);
		cantidadBatallasSiguienteNivel = randomNumber * nivel;
		batallasRealizadas = 0;
	}

	public void batallar() {
		batallasRealizadas++;
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
					JOptionPane.showMessageDialog(null, "Tú mascota necesita ser curada!", "Curar mascota",
							JOptionPane.INFORMATION_MESSAGE);
					enfermar();
				}
				setPeticiones(PeticionesTypes.limpiar, peticionesLimpiar);
			}
		}
	}

	public void enfermar() {
		peticionesCurar++;
		setPeticiones(PeticionesTypes.curar, peticionesCurar);
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.enfermedad, this);
	}

	public void curarEnfermedades(int enfermedadesCuradas) {
		this.peticionesCurar -= enfermedadesCuradas;
		if (peticionesCurar < 0)
			peticionesCurar = 0;
	}

	public void curar(Medicina medicina) {
		medicina.curarEnfermedades(this);
	}

	public void limpiar() {
		setPeticionesLimpiar(0);
		setPeticiones(PeticionesTypes.limpiar, 0);
		logs[HelperClass.getTotalLogs(logs)] = new Log(LogTypes.limpieza, this);
	}

	/* SETTERS */

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

	public String getPeticionesComidaString() {
		return peticionesComidaString;
	}

	public String getPeticionesLimpiarString() {
		return peticionesLimpiarString;
	}

	public String getPeticionesCurarString() {
		return peticionesCurarString;
	}

	public int getPeticionesCurar() {
		return peticionesCurar;
	}

	/*  */

}
