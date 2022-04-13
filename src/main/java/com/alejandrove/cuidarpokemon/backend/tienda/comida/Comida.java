package com.alejandrove.cuidarpokemon.backend.tienda.comida;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public abstract class Comida {

	protected String nombre;
	protected int precio;

	public abstract void accionComida(Mascota mascota);

	/* GETTERS */
	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	/*  */

}
