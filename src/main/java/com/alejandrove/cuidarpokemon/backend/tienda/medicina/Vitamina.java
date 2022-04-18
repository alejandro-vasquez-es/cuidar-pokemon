package com.alejandrove.cuidarpokemon.backend.tienda.medicina;

import com.alejandrove.cuidarpokemon.backend.Mascota;
import com.alejandrove.cuidarpokemon.backend.helpers.PeticionesTypes;

public class Vitamina extends Medicina {

	public Vitamina() {
		this.nombre = "Vitamina";
		this.precio = 20;
	}

	@Override
	public void curarEnfermedades(Mascota mascota) {
		mascota.curarEnfermedades(1);
		mascota.setPeticiones(PeticionesTypes.curar, mascota.getPeticionesCurar());
	}

}
