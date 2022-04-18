package com.alejandrove.cuidarpokemon.backend;

import com.alejandrove.cuidarpokemon.backend.tienda.comida.Comida;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Medicina;

public class Jugador {

	public Mascota[] mascotas;
	public int totalMascotas;
	public Medicina[] medicinas;
	public int totalMedicinas;
	public Comida[] comidas;
	public int totalComidas;
	public int dinero;

	public Jugador() {
		this.mascotas = new Mascota[10];
		this.totalMascotas = 0;
		this.medicinas = new Medicina[100];
		this.totalMedicinas = 0;
		this.comidas = new Comida[100];
		this.totalComidas = 0;
		this.dinero = 2000;
	}

	public void agregarDinero(int dineroAgregado) {
		dinero += dineroAgregado;
	}

	// GETTERS
	public int getDinero() {
		return dinero;
	}

	public int getTotalMascotas() {
		return totalMascotas;
	}

	public int getTotalComidas() {
		return totalComidas;
	}

	public int getTotalMedicinas() {
		return totalMedicinas;
	}
	//

	/* SETTERS */

	/*  */

	public void disminuirComidas() {
		totalComidas--;
	}

	public void disminuirMedicinas() {
		totalMedicinas--;
	}

	public void comprarMascota(Mascota mascota) {
		mascotas[totalMascotas] = mascota;
		dinero -= mascota.precio;
		totalMascotas++;
	}

	public void comprarComida(Comida comida) {
		comidas[totalComidas] = comida;
		dinero -= comida.getPrecio();
		totalComidas++;
	}

	public void comprarMedicina(Medicina medicina) {
		medicinas[totalMedicinas] = medicina;
		dinero -= medicina.precio;
		totalMedicinas++;
	}

}