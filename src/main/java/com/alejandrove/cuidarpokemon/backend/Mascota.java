package com.alejandrove.cuidarpokemon.backend;

import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.helpers.EstadosTypes;
import com.alejandrove.cuidarpokemon.backend.helpers.PeticionesTypes;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Comida;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Medicina;
import com.alejandrove.cuidarpokemon.frontend.mascota.MascotaFrame;

public class Mascota {

	private int nivel;
	public int precio;
	private String apodo;
	private LocalDateTime fechaNacimiento;
	private String estado;
	// TODO: No sé ha utilizado el estado.
	private ImageIcon sprite;
	private String nombre;
	private int tiempoMuerte;
	public HiloPeticion hiloPeticionComida;
	public int segundosPeticionComida;
	private String peticionesComida;
	public MascotaFrame frame;

	public Mascota(String apodo, ImageIcon sprite, String nombre) {
		this.nivel = 1;
		this.precio = 50;
		this.segundosPeticionComida = 10;
		this.hiloPeticionComida = new HiloPeticion(5, segundosPeticionComida, PeticionesTypes.comida, this);
		this.fechaNacimiento = LocalDateTime.now();
		this.apodo = apodo;
		this.sprite = sprite;
		this.nombre = nombre;
		this.frame = null;
	}

	public void nacer() {
		hiloPeticionComida.start();
		hiloPeticionComida.actualizarPeticiones();
		this.estado = EstadosTypes.vivo;
	}

	public void morir() {
		JOptionPane.showMessageDialog(frame,
				"Lamentablemente tu pokemon " + apodo + " de la clase " + nombre + " ha muerto :(", "Pokemon Muerto",
				JOptionPane.WARNING_MESSAGE);
		this.estado = EstadosTypes.muerto;
		hiloPeticionComida.reiniciarPeticiones();
		hiloPeticionComida.actualizarPeticiones();
	}

	public void comer(Comida comida) {
		comida.accionComida(this);
		hiloPeticionComida.actualizarPeticiones();
	}

	// public void curarEnfermedades(int enfermedadesCuradas) {
	// this.peticionesCuracion -= enfermedadesCuradas;
	// }

	public void curar(Medicina medicina) {
		medicina.curarEnfermedades(this);
	}

	/* SETTERS */

	public String getNombre() {
		return nombre;
	}

	public ImageIcon getSprite() {
		return sprite;
	}

	public void setFrame(MascotaFrame frame) {
		this.frame = frame;
	}

	public void setPeticionesComida(String peticionesComida) {
		this.peticionesComida = peticionesComida;
	}

	/*  */

	/* GETTERS */

	public String getApodo() {
		return apodo;
	}

	public String getEstado() {
		return estado;
	}

	public String getPeticionesComida() {
		return peticionesComida;
	}

	/*  */

}
