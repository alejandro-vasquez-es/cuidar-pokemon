package com.alejandrove.cuidarpokemon.backend.helpers;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.Jugador;
import com.alejandrove.cuidarpokemon.backend.Log;
import com.alejandrove.cuidarpokemon.backend.Mascota;
import com.alejandrove.cuidarpokemon.backend.MotorJuego;
import com.alejandrove.cuidarpokemon.frontend.mascota.MascotaFrame;

import java.awt.Image;

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

	public static void scaleImage(ImageIcon icon, JLabel label) {
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		label.setIcon(scaledIcon);
	}

	public static void abrirPokemonFrame(JFrame parent, MotorJuego juego, Mascota mascota) {
		if (mascota != null) {
			MascotaFrame mascotaFrame = new MascotaFrame(parent, juego, mascota);
			parent.setVisible(false);
			mascotaFrame.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(
					parent,
					"Tienes un espacio disponible para agregar un pokemon, puedes hacerlo comprándolo en la tienda",
					"Espacio disponible",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static int getTotalLogs(Log[] logs) {
		int i = 0;
		while (logs[i] != null) {
			i++;
		}
		return i;
	}

}
