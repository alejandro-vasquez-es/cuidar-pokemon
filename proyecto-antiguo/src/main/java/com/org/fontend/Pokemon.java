package com.org.fontend;

import com.org.backend.helpers.Get;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Pokemon extends JFrame {
    private JPanel bg;
    private JLabel labelImage;
    private JLabel labelTitle;

    public Pokemon(int id) {
        super("Pokemon");
        String[] data = Get.nameAndUrl(id);
        String name = data[0];
        String urlString = data[1];

        Image image = null;
        try {
            URL url = new URL(urlString);
            image = ImageIO.read(url);
        } catch (IOException e) {
        }

        ImageIcon imagePokemon = new ImageIcon(image);

        labelImage.setText("");
        labelImage.setIcon(imagePokemon);
        labelTitle.setText(name);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(bg);
        this.pack();
    }

}
