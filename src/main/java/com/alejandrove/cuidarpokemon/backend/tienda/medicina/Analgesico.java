package com.alejandrove.cuidarpokemon.backend.tienda.medicina;

import com.alejandrove.cuidarpokemon.backend.Mascota;
import com.alejandrove.cuidarpokemon.backend.helpers.PeticionesTypes;

public class Analgesico extends Medicina {

	public Analgesico() {
		this.nombre = "Analgesico";
		this.precio = 50;
	}

	@Override
	public void curarEnfermedades(Mascota mascota) {
		mascota.curarEnfermedades(2);
		mascota.setPeticiones(PeticionesTypes.curar, mascota.getPeticionesCurar());
	}

}
