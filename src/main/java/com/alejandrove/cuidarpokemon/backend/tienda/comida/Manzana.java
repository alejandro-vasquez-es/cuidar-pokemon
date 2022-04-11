package com.alejandrove.cuidarpokemon.backend.tienda.comida;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public class Manzana extends Comida {

	public Manzana() {
		this.nombre = "manzana";
		this.precio = 10;
	}

	@Override
	public void accionComida(Mascota mascota) {
		mascota.disminuirPeticionesComida();
	}
}
