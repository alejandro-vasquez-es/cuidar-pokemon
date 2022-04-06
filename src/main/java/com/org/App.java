package com.org;

import com.org.helpers.Get;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {

        JFrame frame = new Pokemon(151);
        frame.setVisible(true);
        JFrame frame2 = new Pokemon(100);
        frame2.setVisible(true);
    }
}
