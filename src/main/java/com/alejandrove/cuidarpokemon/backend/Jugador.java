package com.alejandrove.cuidarpokemon.backend;

import com.alejandrove.cuidarpokemon.backend.tienda.comida.Comida;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Medicina;

public class Jugador {

	private Mascota[] mascotas;
	private int totalMascotas;
	private Medicina[] medicinas;
	private int totalMedicinas;
	private Comida[] comidas;
	private int totalComidas;
	private int dinero;

	public Jugador() {
		this.mascotas = new Mascota[10];
		this.totalMascotas = 0;
		this.medicinas = new Medicina[100];
		this.totalMedicinas = 0;
		this.comidas = new Comida[100];
		this.totalComidas = 0;
		this.dinero = 100;
	}

	// GETTERS
	public int getDinero() {
		return dinero;
	}
	//

	public void comprarMascota(Mascota mascota) {
		mascotas[totalMascotas] = mascota;
		dinero -= mascota.precio;
		totalMascotas++;
	}

	public void comprarComida(Comida comida) {
		comidas[totalComidas] = comida;
		dinero -= comida.precio;
		totalComidas++;
	}

	public void comprarMedicina(Medicina medicina) {
		medicinas[totalMedicinas] = medicina;
		dinero -= medicina.precio;
		totalMedicinas++;
	}

}
