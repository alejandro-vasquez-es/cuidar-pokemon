package com.org;

import com.org.fontend.CuidarPokemonFrame;
import com.org.fontend.Pokemon;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {

//        JFrame frame = new Pokemon(151);
//        frame.setVisible(true);
//        JFrame frame2 = new Pokemon(100);
//        frame2.setVisible(true);

        JFrame juego = new CuidarPokemonFrame();
        juego.setVisible(true);
    }
}
