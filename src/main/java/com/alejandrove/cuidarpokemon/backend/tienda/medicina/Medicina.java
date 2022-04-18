package com.alejandrove.cuidarpokemon.backend.tienda.medicina;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public abstract class Medicina {

	public String nombre;
	public int precio;

	public abstract void curarEnfermedades(Mascota mascota);

	/* GETTERS */
	public String getNombre() {
		return nombre;
	}
	/*  */
}
