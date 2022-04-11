package com.alejandrove.cuidarpokemon.backend.helpers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.Jugador;

public class HelperClass {

	public static boolean verificarPrecio(Jugador jugador, int precio, JFrame jframe) {
		if (precio > jugador.getDinero()) {
			JOptionPane.showMessageDialog(
					jframe,
					"Tienes " + jugador.getDinero() + " monedas y para realizar tu compra necesitas " + precio,
					"Dinero insuficiente",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}

	public static void compraExitosa(JFrame jframe, Jugador jugador) {
		JOptionPane.showMessageDialog(
				jframe,
				"Tu compra se realizó con éxito, pasas a tener " + jugador.getDinero() + " monedas",
				"Compra realizada",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
