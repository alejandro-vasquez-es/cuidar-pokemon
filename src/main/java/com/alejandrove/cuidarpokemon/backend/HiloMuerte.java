package com.alejandrove.cuidarpokemon.backend;

public class HiloMuerte extends Thread {

	private int tiempoMuerte;
	private Mascota mascota;

	public HiloMuerte(int tiempoMuerte, Mascota mascota) {
		this.tiempoMuerte = tiempoMuerte * 1000;
		this.mascota = mascota;

	}

	@Override
	public void run() {
		try {
			sleep(tiempoMuerte);
		} catch (InterruptedException e) {
			System.out.println("Error en el sleep");
		}

		mascota.morir();
	}

}
