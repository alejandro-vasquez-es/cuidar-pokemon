package com.alejandrove.cuidarpokemon.frontend.memoria;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.alejandrove.cuidarpokemon.backend.helpers.HelperClass;

public class Card extends JLabel {

	private int id;
	private ImageIcon pokemonSprite;
	private Icon pokebola;
	private boolean cardEncontrada;

	public Card() {
		super();
	}

	public void setCardAttributes(int id, ImageIcon pokemonSprite) {
		this.id = id;
		this.pokemonSprite = pokemonSprite;
		this.pokebola = getIcon();
		this.cardEncontrada = false;
	}

	public void voltearCard() {
		HelperClass.scaleImage(pokemonSprite, this);
	}

	public void regresarCard() {
		setIcon(pokebola);
	}

	public void encontrada() {
		cardEncontrada = true;
	}

	public int getId() {
		return id;
	}

	public boolean getCardEncontrad() {
		return cardEncontrada;
	}

}
