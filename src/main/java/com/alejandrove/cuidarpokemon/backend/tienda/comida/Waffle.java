package com.alejandrove.cuidarpokemon.backend.tienda.comida;

import com.alejandrove.cuidarpokemon.backend.Mascota;

public class Waffle extends Comida implements AfectarPeticionesMaximas {

	public Waffle() {
		this.nombre = "waffle";
		this.precio = 50;
	}

	@Override
	public void afectarPeticionesMaximas(Mascota mascota) {
		mascota.hiloPeticionComida.setPeticionesMaximas(10);
	}

	@Override
	public void accionComida(Mascota mascota) {
		mascota.hiloPeticionComida.reiniciarPeticiones();
		afectarPeticionesMaximas(mascota);
	}

}
