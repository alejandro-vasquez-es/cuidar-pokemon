package com.alejandrove.cuidarpokemon.backend;

import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import com.alejandrove.cuidarpokemon.backend.tienda.comida.Cereal;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Comida;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Manzana;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Waffle;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Analgesico;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Antibiotico;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Medicina;
import com.alejandrove.cuidarpokemon.backend.tienda.medicina.Vitamina;

public class Tienda {

	Comida[] comidas;
	Medicina[] medicinas;

	public Tienda() {
		llenarComidas();
		llenarMedicinas();
	}

	public void llenarComidas() {
		comidas = new Comida[] {
				new Manzana(),
				new Cereal(),
				new Waffle(),
		};
	}

	public void llenarMedicinas() {
		medicinas = new Medicina[] {
				new Vitamina(),
				new Analgesico(),
				new Antibiotico(),
		};
	}

	public void venderPokemon(int idPokemon, String[] data, String apodo, Jugador jugador, Log[] logs) {

		Image image = null;
		try {
			URL url = new URL(data[1]);
			image = ImageIO.read(url);
		} catch (IOException e) {
		}

		ImageIcon sprite = new ImageIcon(image);

		jugador.comprarMascota(new Mascota(apodo, sprite, data[0], logs));
	}

	public void venderComida(Jugador jugador, Comida comida) {
		jugador.comprarComida(comida);
	}

	public void venderMedicina(Jugador jugador, Medicina medicina) {
		jugador.comprarMedicina(medicina);
	}

}
