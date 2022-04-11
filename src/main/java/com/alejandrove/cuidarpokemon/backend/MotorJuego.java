package com.alejandrove.cuidarpokemon.backend;

public class MotorJuego {

	public Jugador jugador;
	public Tienda tienda;
	public Log[] logs;

	public MotorJuego() {
		jugador = new Jugador();
		tienda = new Tienda();
		logs = new Log[250];
	}

}
