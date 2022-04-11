package com.alejandrove.cuidarpokemon.backend.tienda.medicina;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public class Antibiotico extends Medicina {

	public Antibiotico() {
		this.nombre = "Antibiotico";
		this.precio = 80;
	}

	@Override
	public void curarEnfermedades(Mascota mascota) {
		mascota.curarEnfermedades(3);
	}

}
