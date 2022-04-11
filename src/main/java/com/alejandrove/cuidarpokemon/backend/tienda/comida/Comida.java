package com.alejandrove.cuidarpokemon.backend.tienda.comida;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public abstract class Comida {

	public String nombre;
	public int precio;

	public abstract void accionComida(Mascota mascota);

}
