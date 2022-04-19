package com.alejandrove.cuidarpokemon.frontend;

import java.util.Comparator;

import com.alejandrove.cuidarpokemon.backend.Log;

public class OrdenarPorNivelMayorMenor implements Comparator<Log> {

	public int compare(Log a, Log b) {
		return b.getNivel() - a.getNivel();
	}

}
