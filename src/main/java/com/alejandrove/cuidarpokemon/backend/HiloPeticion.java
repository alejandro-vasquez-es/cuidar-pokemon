package com.alejandrove.cuidarpokemon.backend;

import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.helpers.PeticionesTypes;

public class HiloPeticion extends Thread {

	private int peticiones;
	private int peticionesMaximas;
	private int tiempoMilisegundos;
	private String tipo;
	private Mascota mascota;

	public HiloPeticion(int peticionesMaximas, int segundos, String tipo, Mascota mascota) {
		this.peticiones = 0;
		this.peticionesMaximas = peticionesMaximas;
		this.tiempoMilisegundos = segundos * 1000;
		this.mascota = mascota;
		this.tipo = tipo;
	}

	@Override
	public void run() {
		while (peticionesMaximas > peticiones) {

			try {
				sleep(tiempoMilisegundos);
			} catch (InterruptedException ex) {
				System.out.println("Error en el sleep " + ex);
			}
			JOptionPane.showMessageDialog(null, "Tu mascota " + mascota.getApodo() + " realizó una petición de " + tipo,
					"Petición",
					JOptionPane.INFORMATION_MESSAGE);
			peticiones++;
			actualizarPeticiones();
		}
		// TODO: qué pasa al alcanzar el límite de peticiones
		limitePeticionesAlcanzado();

	}

	public void actualizarPeticiones() {
		mascota.setPeticiones(tipo, peticiones);

	}

	/* SETTERS */

	public void setPeticionesMaximas(int peticionesMaximas) {
		this.peticionesMaximas = peticionesMaximas;
	}

	/*  */

	/* GETTERS */

	public int getPeticiones() {
		return peticiones;
	}

	/*  */

	public void reiniciarPeticiones() {
		peticiones = 0;
	}

	public void limitePeticionesAlcanzado() {
		switch (tipo) {
			case PeticionesTypes.comida:
				mascota.morir();
				break;
			case PeticionesTypes.limpiar:

				break;
			case PeticionesTypes.curar:

				break;
			case PeticionesTypes.pasear:

				break;

			default:
				break;
		}
	}

}
