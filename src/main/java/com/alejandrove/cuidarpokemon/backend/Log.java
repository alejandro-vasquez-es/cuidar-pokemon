package com.alejandrove.cuidarpokemon.backend;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.alejandrove.cuidarpokemon.backend.helpers.LogTypes;

public class Log {

	private String tipo;
	private String informacion;
	private LocalDateTime fechaHora;
	private int nivel;

	public Log(String tipo, Mascota mascota) {
		this.tipo = tipo;
		fechaHora = LocalDateTime.now();
		setInformacionSegunTipo(tipo, mascota);
	}

	public Log(String tipo, Mascota mascota, int nivel) {
		this.tipo = tipo;
		fechaHora = LocalDateTime.now();
		this.nivel = nivel;
		setInformacionSegunTipo(tipo, mascota);
	}

	/* GETTERS */
	public String getTipo() {
		return tipo;
	}

	public int getNivel() {
		return nivel;
	}
	/*  */

	/* SETTERS */

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	/* */

	public void setInformacionSegunTipo(String tipo, Mascota mascota) {
		switch (tipo) {
			case LogTypes.enfermedad:
				setInformacion("Se ha curado al pokemon con el apodo de " + mascota.getApodo() + " con una medicina");
				break;
			case LogTypes.comida:
				setInformacion("Se ha alimentado al pokemon con el apodo de " + mascota.getApodo() + " con una comida");
				break;
			case LogTypes.paseo:
				setInformacion("Se ha sacado a pasear al pokemon con el apodo de " + mascota.getApodo());
				break;
			case LogTypes.nivel:
				setInformacion("El pokemon con el apodo de  " + mascota.getApodo() + " ha subido al nivel "
						+ nivel);
				break;
			case LogTypes.muerte:
				setInformacion("El pokemon con el apodo de " + mascota.getApodo() + " se ha muerto :(");
				break;
			case LogTypes.nacimiento:
				setInformacion("El pokemon con el apodo de " + mascota.getApodo() + " ha nacido");
				break;
			case LogTypes.limpieza:
				setInformacion("El pokemon con el apodo de " + mascota.getApodo() + " se ha limpiado");
				break;

			default:
				break;
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime = fechaHora.format(formatter);
		return formatDateTime + " " + informacion;
	}

}
