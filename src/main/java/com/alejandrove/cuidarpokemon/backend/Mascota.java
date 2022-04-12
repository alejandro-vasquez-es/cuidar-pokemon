package com.alejandrove.cuidarpokemon.backend;

import java.time.LocalDateTime;

import javax.swing.ImageIcon;

import com.alejandrove.cuidarpokemon.backend.tienda.comida.Comida;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Medicina;

public class Mascota {

	private int nivel;
	public int precio;
	private String apodo;
	private LocalDateTime fechaNacimiento;
	private String estado;
	// TODO: No sé ha utilizado el estado.
	private int peticionesComida;
	private int peticionesLimpiar;
	private int peticionesCuracion;
	private int peticionesPaseo;
	private int peticionesMaximasComida;
	final private int PETICIONES_MAXIMAS_LIMPIAR = 3;
	final private int PETICIONES_MAXIMAS_CURAR = 6;
	final private int PETICIONES_MAXIMAS_PASEO = 4;
	private ImageIcon sprite;
	private String nombre;
	private int tiempoMuerte;

	public Mascota(String apodo, ImageIcon sprite, String nombre) {
		this.nivel = 1;
		this.precio = 50;
		this.fechaNacimiento = LocalDateTime.now();
		this.peticionesComida = 0;
		this.peticionesLimpiar = 0;
		this.peticionesCuracion = 0;
		this.peticionesPaseo = 0;
		this.peticionesMaximasComida = 5;
		this.apodo = apodo;
		this.sprite = sprite;
		this.nombre = nombre;
	}

	/* SETTERS */

	public String getNombre() {
		return nombre;
	}

	public ImageIcon getSprite() {
		return sprite;
	}

	public void setPeticionesComida(int peticionesComida) {
		this.peticionesComida = peticionesComida;
	}

	public void setPeticionesMaximasComida(int peticionesMaximasComida) {
		this.peticionesMaximasComida = peticionesMaximasComida;
	}

	/*  */

	/* GETTERS */

	public String getApodo() {
		return apodo;
	}

	/*  */

	public void disminuirPeticionesComida() {
		this.peticionesComida--;
	}

	public void comer(Comida comida) {
		comida.accionComida(this);
	}

	public void curarEnfermedades(int enfermedadesCuradas) {
		this.peticionesCuracion -= enfermedadesCuradas;
	}

	public void curar(Medicina medicina) {
		medicina.curarEnfermedades(this);
	}

}
