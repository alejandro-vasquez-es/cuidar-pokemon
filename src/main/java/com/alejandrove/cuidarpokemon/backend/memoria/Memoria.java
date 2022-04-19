package com.alejandrove.cuidarpokemon.backend.memoria;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.helpers.Get;
import com.alejandrove.cuidarpokemon.frontend.mascota.PasearFrame;
import com.alejandrove.cuidarpokemon.frontend.memoria.Card;
import com.alejandrove.cuidarpokemon.frontend.memoria.MemoriaFrame;

public class Memoria {

	public int parejas;
	public ImageIcon[] sprites;
	public int[] ids;
	public int totalIds;
	public Jugador jugador;
	public Jugador oponente;
	public int totalCardsLevantadas;
	public Card[] cardsLevantadas;
	public JFrame frame;
	public boolean tiempoDeEsperaActivo;
	public Jugador jugadorActivo;
	private int totalParejasEncontradas;

	public Memoria(int parejas, JFrame frame) {
		this.parejas = parejas;
		this.totalIds = 0;
		this.ids = new int[parejas];
		this.sprites = new ImageIcon[parejas];
		this.frame = frame;
		this.cardsLevantadas = new Card[2];
		this.tiempoDeEsperaActivo = false;
		this.totalParejasEncontradas = 0;
	}

	public void getImagenes() {
		for (int i = 0; i < parejas; i++) {
			int randomNumber = (int) Math.floor(Math.random() * (151 - 1 + 1) + 1);
			while (existeId(randomNumber)) {
				randomNumber = (int) Math.floor(Math.random() * (151 - 1 + 1) + 1);
			}
			String[] data = Get.nameAndUrl(randomNumber);
			Image image = null;
			try {
				URL url = new URL(data[1]);
				image = ImageIO.read(url);
			} catch (IOException e) {
				System.out.println(e);
			}
			ImageIcon sprite = new ImageIcon(image);
			sprites[totalIds] = sprite;
			ids[totalIds] = randomNumber;
			totalIds++;

		}
	}

	public void setJugadores(JLabel labelJugador, String nombreJugador, JLabel labelOponente, String nombreOponente) {
		jugador = new Jugador(labelJugador, nombreJugador);
		oponente = new Jugador(labelOponente, nombreOponente);
		setOponentes();
		jugadorActivo = jugador;
	}

	public void setOponentes() {
		jugador.setOponente(oponente);
		oponente.setOponente(jugador);
	}

	public boolean existeId(int randomNumber) {
		for (int i = 0; i < totalIds; i++) {
			if (ids[i] == randomNumber) {
				return true;
			}
		}
		return false;
	}

	public void voltearCard(Card card) {
		if (!card.equals(cardsLevantadas[0]) && !tiempoDeEsperaActivo && !card.getCardEncontrad()) {
			card.voltearCard();
			cardsLevantadas[totalCardsLevantadas] = card;
			totalCardsLevantadas++;
			if (totalCardsLevantadas == 2) {
				tiempoDeEsperaActivo = true;
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						if (cardsLevantadas[0].getId() == card.getId()) {
							JOptionPane.showMessageDialog(frame,
									"Se ha encontrado una pareja, " + jugadorActivo.getNombre() + " mantiene el turno",
									"Pareja encontrada", JOptionPane.INFORMATION_MESSAGE);
							totalParejasEncontradas++;
							jugadorActivo.parejaEncontrada();
							jugadorActivo.actualizarPunteo();
							card.encontrada();
							cardsLevantadas[0].encontrada();
							comprobarGanador();
						} else {
							card.regresarCard();
							cardsLevantadas[0].regresarCard();
							JOptionPane.showMessageDialog(frame,
									"Esta no es una pareja, termina el turno de " + jugadorActivo.getNombre(),
									"Pareja no encontrada", JOptionPane.INFORMATION_MESSAGE);
							cardsLevantadas = new Card[2];
							cambiarJugadorActivo();
						}
						totalCardsLevantadas = 0;
						tiempoDeEsperaActivo = false;
					}
				}, 700);
			}
		}
	}

	public void cambiarJugadorActivo() {
		jugadorActivo = (jugador.equals(jugadorActivo)) ? oponente : jugador;
	}

	public void comprobarGanador() {

		if (totalParejasEncontradas == parejas) {

			if (jugador.getParejasVolteadas() == oponente.getParejasVolteadas()) {
				JOptionPane.showMessageDialog(frame, "El juego ha terminado en empate!", "Juego terminado",
						JOptionPane.INFORMATION_MESSAGE);
				((PasearFrame) ((MemoriaFrame) frame).parent).mascotaPaseada(false);
			} else if (jugador.getParejasVolteadas() > oponente.getParejasVolteadas()) {
				JOptionPane.showMessageDialog(frame, "Tu pokemon ha ganado!", "Juego terminado",
						JOptionPane.INFORMATION_MESSAGE);
				((PasearFrame) ((MemoriaFrame) frame).parent).mascotaPaseada(true);
			} else if (jugador.getParejasVolteadas() < oponente.getParejasVolteadas()) {
				JOptionPane.showMessageDialog(frame, "El pokemon rival ha ganado!", "Juego terminado",
						JOptionPane.INFORMATION_MESSAGE);
				((PasearFrame) ((MemoriaFrame) frame).parent).mascotaPaseada(false);
			}
			frame.setVisible(false);
			frame.dispose();
			((MemoriaFrame) frame).parent.setVisible(true);

		}

	}

}
