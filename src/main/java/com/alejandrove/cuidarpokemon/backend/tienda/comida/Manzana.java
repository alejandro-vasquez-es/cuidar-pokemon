package com.alejandrove.cuidarpokemon.backend.tienda.comida;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public class Manzana extends Comida implements AfectarPeticionesMaximas {

	public Manzana() {
		this.nombre = "manzana";
		this.precio = 10;
	}

	@Override
	public void afectarPeticionesMaximas(Mascota mascota) {
		mascota.hiloPeticionComida.setPeticionesMaximas(5);
	}

	@Override
	public void accionComida(Mascota mascota) {
		mascota.hiloPeticionComida.reiniciarPeticiones();
		afectarPeticionesMaximas(mascota);
	}
}
