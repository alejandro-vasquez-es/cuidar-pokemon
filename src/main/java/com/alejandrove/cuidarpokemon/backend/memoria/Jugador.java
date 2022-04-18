package com.alejandrove.cuidarpokemon.backend.memoria;

import javax.swing.JLabel;

public class Jugador {
	private int parejasVolteadas;
	private Jugador oponente;
	private JLabel label;
	private String nombre;

	public Jugador(JLabel label, String nombre) {
		this.parejasVolteadas = 0;
		this.label = label;
		this.nombre = nombre;
		actualizarPunteo();
	}

	public void setOponente(Jugador oponente) {
		this.oponente = oponente;
	}

	public String getNombre() {
		return nombre;
	}

	public int getParejasVolteadas() {
		return parejasVolteadas;
	}

	public void parejaEncontrada() {
		parejasVolteadas++;
	}

	public void actualizarPunteo() {
		label.setText(nombre + ": " + parejasVolteadas);
	}
}
