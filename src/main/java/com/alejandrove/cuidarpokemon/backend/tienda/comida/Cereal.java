package com.alejandrove.cuidarpokemon.backend.tienda.comida;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public class Cereal extends Comida implements AfectarPeticionesMaximas {

	public Cereal() {
		this.nombre = "cereal";
		this.precio = 30;
	}

	@Override
	public void afectarPeticionesMaximas(Mascota mascota) {
		mascota.setPeticionesMaximasComida(7);
	}

	@Override
	public void accionComida(Mascota mascota) {
		mascota.setPeticionesComida(0);
		afectarPeticionesMaximas(mascota);
	}

}
