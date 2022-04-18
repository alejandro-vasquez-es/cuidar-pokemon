/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandrove.cuidarpokemon.frontend.memoria;

import javax.swing.JOptionPane;

import com.alejandrove.cuidarpokemon.backend.memoria.Memoria;

/**
 *
 * @author aleja
 */
public class MemoriaFrame extends javax.swing.JFrame {

        Card[] imagenesLabel;
        Memoria memoria;
        int[] posiciones;
        int totalPosiciones;

        /**
         * Creates new form MemoriaFrame
         */
        public MemoriaFrame(int parejas) {
                initComponents();
                setImagenesLabel();
                this.memoria = new Memoria(parejas, this);
                memoria.getImagenes();
                memoria.setJugadores(jugador1Label, "tu mascota", jugador2Label, "mascota rival");
                posiciones = new int[parejas * 2];
                totalPosiciones = 0;
                setImagenesLabel();
                setImageIconSegunParejas();
                addListeners();
                JOptionPane.showMessageDialog(this, "Bienvenido al juego de memoria, tu mascota empieza jugando.",
                                "Mensaje inicial", JOptionPane.INFORMATION_MESSAGE);
        }

        public void addListeners() {
                for (int i = 0; i < posiciones.length; i++) {
                        imagenesLabel[i].addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        clickearCard(evt);
                                }
                        });
                }
        }

        public void clickearCard(java.awt.event.MouseEvent evt) {
                Object card = evt.getSource();
                memoria.voltearCard((Card) card);
        }

        public void setImageIconSegunParejas() {
                for (int i = 0; i < memoria.parejas; i++) {
                        for (int j = 0; j < 2; j++) {
                                int posicionRandom = (int) Math
                                                .floor(Math.random() * ((posiciones.length - 1) - 0 + 1) + 0);
                                while (existePosicion(posicionRandom)) {
                                        posicionRandom = (int) Math
                                                        .floor(Math.random() * ((posiciones.length - 1) - 0 + 1) + 0);
                                }
                                // HelperClass.scaleImage(memoria.sprites[i], imagenesLabel[posicionRandom]);
                                imagenesLabel[posicionRandom].setEnabled(true);
                                posiciones[totalPosiciones] = posicionRandom;
                                imagenesLabel[posicionRandom].setCardAttributes(memoria.ids[i], memoria.sprites[i]);
                                totalPosiciones++;
                        }
                }
        }

        public boolean existePosicion(int posicion) {
                for (int i = 0; i < totalPosiciones; i++) {
                        if (posiciones[i] == posicion) {
                                return true;
                        }
                }
                return false;
        }

        public void setImagenesLabel() {
                imagenesLabel = new Card[] {
                                imagen1Label,
                                imagen2Label,
                                imagen3Label,
                                imagen4Label,
                                imagen5Label,
                                imagen6Label,
                                imagen7Label,
                                imagen8Label,
                                imagen9Label,
                                imagen10Label,
                                imagen11Label,
                                imagen12Label,
                                imagen13Label,
                                imagen14Label,
                                imagen15Label,
                                imagen16Label,
                                imagen17Label,
                                imagen18Label,
                                imagen19Label,
                                imagen20Label,
                                imagen21Label,
                                imagen22Label,
                                imagen23Label,
                                imagen24Label,
                                imagen25Label,
                                imagen26Label,
                                imagen27Label,
                                imagen28Label,
                                imagen29Label,
                                imagen30Label,
                                imagen31Label,
                                imagen32Label,
                                imagen33Label,
                                imagen34Label,
                                imagen35Label,
                                imagen36Label,
                                imagen37Label,
                                imagen38Label,
                                imagen39Label,
                                imagen40Label
                };
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                imagen31Label = new Card();
                imagen36Label = new Card();
                imagen35Label = new Card();
                imagen33Label = new Card();
                imagen37Label = new Card();
                imagen21Label = new Card();
                imagen23Label = new Card();
                imagen25Label = new Card();
                imagen27Label = new Card();
                imagen29Label = new Card();
                imagen13Label = new Card();
                imagen1Label = new Card();
                imagen5Label = new Card();
                imagen9Label = new Card();
                imagen17Label = new Card();
                imagen14Label = new Card();
                imagen2Label = new Card();
                imagen6Label = new Card();
                imagen10Label = new Card();
                imagen18Label = new Card();
                imagen15Label = new Card();
                imagen3Label = new Card();
                imagen7Label = new Card();
                imagen11Label = new Card();
                imagen19Label = new Card();
                imagen16Label = new Card();
                imagen4Label = new Card();
                imagen8Label = new Card();
                imagen12Label = new Card();
                imagen20Label = new Card();
                imagen22Label = new Card();
                imagen24Label = new Card();
                imagen26Label = new Card();
                imagen28Label = new Card();
                imagen30Label = new Card();
                imagen32Label = new Card();
                imagen34Label = new Card();
                imagen38Label = new Card();
                imagen39Label = new Card();
                imagen40Label = new Card();
                jugador1Label = new javax.swing.JLabel();
                jugador2Label = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Juego de memoria");

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
                jPanel1.setPreferredSize(new java.awt.Dimension(786, 639));

                imagen31Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen31Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen31Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen31Label.setEnabled(false);
                imagen31Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen36Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen36Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen36Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen36Label.setEnabled(false);
                imagen36Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen35Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen35Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen35Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen35Label.setEnabled(false);
                imagen35Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen33Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen33Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen33Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen33Label.setEnabled(false);
                imagen33Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen37Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen37Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen37Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen37Label.setEnabled(false);
                imagen37Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen21Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen21Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen21Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen21Label.setEnabled(false);
                imagen21Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen23Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen23Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen23Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen23Label.setEnabled(false);
                imagen23Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen25Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen25Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen25Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen25Label.setEnabled(false);
                imagen25Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen27Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen27Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen27Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen27Label.setEnabled(false);
                imagen27Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen29Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen29Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen29Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen29Label.setEnabled(false);
                imagen29Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen13Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen13Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen13Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen13Label.setEnabled(false);
                imagen13Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen1Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen1Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen1Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen1Label.setEnabled(false);
                imagen1Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen5Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen5Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen5Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen5Label.setEnabled(false);
                imagen5Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen9Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen9Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen9Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen9Label.setEnabled(false);
                imagen9Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen17Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen17Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen17Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen17Label.setEnabled(false);
                imagen17Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen14Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen14Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen14Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen14Label.setEnabled(false);
                imagen14Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen2Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen2Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen2Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen2Label.setEnabled(false);
                imagen2Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen6Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen6Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen6Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen6Label.setEnabled(false);
                imagen6Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen10Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen10Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen10Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen10Label.setEnabled(false);
                imagen10Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen18Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen18Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen18Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen18Label.setEnabled(false);
                imagen18Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen15Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen15Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen15Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen15Label.setEnabled(false);
                imagen15Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen3Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen3Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen3Label.setEnabled(false);
                imagen3Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen7Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen7Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen7Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen7Label.setEnabled(false);
                imagen7Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen11Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen11Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen11Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen11Label.setEnabled(false);
                imagen11Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen19Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen19Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen19Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen19Label.setEnabled(false);
                imagen19Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen16Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen16Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen16Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen16Label.setEnabled(false);
                imagen16Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen4Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen4Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen4Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen4Label.setEnabled(false);
                imagen4Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen8Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen8Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen8Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen8Label.setEnabled(false);
                imagen8Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen12Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen12Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen12Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen12Label.setEnabled(false);
                imagen12Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen20Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen20Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen20Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen20Label.setEnabled(false);
                imagen20Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen22Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen22Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen22Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen22Label.setEnabled(false);
                imagen22Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen24Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen24Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen24Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen24Label.setEnabled(false);
                imagen24Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen26Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen26Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen26Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen26Label.setEnabled(false);
                imagen26Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen28Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen28Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen28Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen28Label.setEnabled(false);
                imagen28Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen30Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen30Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen30Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen30Label.setEnabled(false);
                imagen30Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen32Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen32Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen32Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen32Label.setEnabled(false);
                imagen32Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen34Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen34Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen34Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen34Label.setEnabled(false);
                imagen34Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen38Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen38Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen38Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen38Label.setEnabled(false);
                imagen38Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen39Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen39Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen39Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen39Label.setEnabled(false);
                imagen39Label.setPreferredSize(new java.awt.Dimension(120, 120));

                imagen40Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
                imagen40Label.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                imagen40Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                imagen40Label.setEnabled(false);
                imagen40Label.setPreferredSize(new java.awt.Dimension(120, 120));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen31Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen36Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen35Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen33Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen37Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen21Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen27Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen25Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen23Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen29Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen13Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen9Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen5Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen1Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen17Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen14Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen10Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen6Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen2Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen18Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen15Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen11Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen7Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen3Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen19Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen16Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen12Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen8Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen4Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen20Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen22Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen28Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen26Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen24Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen30Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(imagen32Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen39Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen38Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen34Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(imagen40Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(imagen16Label,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(imagen4Label,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(imagen8Label,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(imagen12Label,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(imagen20Label,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(imagen31Label,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(imagen33Label,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(imagen35Label,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(imagen36Label,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(imagen37Label,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(imagen15Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen3Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen7Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen11Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen19Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(imagen14Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen2Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen6Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen10Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen18Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(imagen13Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen1Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen5Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen9Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen17Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(imagen21Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen23Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen25Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen27Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(imagen29Label,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(imagen22Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen24Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen26Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen28Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen30Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(imagen32Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen34Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen38Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen39Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(imagen40Label,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 9, Short.MAX_VALUE)));

                jugador1Label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
                jugador1Label.setText("Jugador 1: ");

                jugador2Label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
                jugador2Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jugador2Label.setText("Jugador 2: ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jPanel1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                1034,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(0, 2, Short.MAX_VALUE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jugador1Label)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jugador2Label)))
                                                                                                .addContainerGap()))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                653,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jugador1Label)
                                                                                .addComponent(jugador2Label))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private Card imagen10Label;
        private Card imagen11Label;
        private Card imagen12Label;
        private Card imagen13Label;
        private Card imagen14Label;
        private Card imagen15Label;
        private Card imagen16Label;
        private Card imagen17Label;
        private Card imagen18Label;
        private Card imagen19Label;
        private Card imagen1Label;
        private Card imagen20Label;
        private Card imagen21Label;
        private Card imagen22Label;
        private Card imagen23Label;
        private Card imagen24Label;
        private Card imagen25Label;
        private Card imagen26Label;
        private Card imagen27Label;
        private Card imagen28Label;
        private Card imagen29Label;
        private Card imagen2Label;
        private Card imagen30Label;
        private Card imagen31Label;
        private Card imagen32Label;
        private Card imagen33Label;
        private Card imagen34Label;
        private Card imagen35Label;
        private Card imagen36Label;
        private Card imagen37Label;
        private Card imagen38Label;
        private Card imagen39Label;
        private Card imagen3Label;
        private Card imagen40Label;
        private Card imagen4Label;
        private Card imagen5Label;
        private Card imagen6Label;
        private Card imagen7Label;
        private Card imagen8Label;
        private Card imagen9Label;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel jugador1Label;
        private javax.swing.JLabel jugador2Label;
        // End of variables declaration//GEN-END:variables

        public static void main(String[] args) {
                MemoriaFrame memoriaFrame = new MemoriaFrame(20);
                memoriaFrame.setVisible(true);
        }

}
