/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandrove.cuidarpokemon.frontend.tienda;

import com.alejandrove.cuidarpokemon.backend.MotorJuego;
import com.alejandrove.cuidarpokemon.backend.helpers.HelperClass;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Cereal;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Manzana;
import com.alejandrove.cuidarpokemon.backend.tienda.comida.Waffle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class RestauranteFrame extends javax.swing.JFrame {

        JFrame parent;
        MotorJuego juego;

        /**
         * Creates new form RestauranteFrame
         */
        public RestauranteFrame(JFrame parent, MotorJuego juego) {
                this.parent = parent;
                this.juego = juego;
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jButton10 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
                jLabel1.setText("Restaurante");

                jButton10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
                jButton10.setText("Regresar");
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton10ActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jLabel2.setText("- Manzana:");

                jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jLabel3.setText("- Cereal:");

                jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jLabel4.setText("- Waffle:");

                jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jLabel5.setText("10");

                jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jLabel6.setText("30");

                jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jLabel7.setText("50");

                jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jButton1.setText("Comprar");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jButton2.setText("Comprar");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
                jButton3.setText("Comprar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
                jLabel8.setText("Comida / Precio (Monedas)");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addContainerGap(
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jButton10))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(124, 124,
                                                                                                                                                124)
                                                                                                                                .addComponent(jLabel1))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(115, 115,
                                                                                                                                                115)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel7))
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel6))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                                                .addComponent(jLabel2)
                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                .addComponent(jLabel5)))
                                                                                                                                .addGap(34, 34, 34)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jButton1)
                                                                                                                                                .addComponent(jButton2)
                                                                                                                                                .addComponent(jButton3)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(143, 143,
                                                                                                                                                143)
                                                                                                                                .addComponent(jLabel8)))
                                                                                                .addGap(0, 109, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                46,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jButton1))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jButton2))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(jButton3))
                                                                .addGap(70, 70, 70)
                                                                .addComponent(jButton10)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
                this.setVisible(false);
                parent.setVisible(true);
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton10ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                if (HelperClass.verificarPrecio(juego.jugador, 10, this)) {
                        juego.tienda.venderComida(juego.jugador, new Manzana());
                        HelperClass.compraExitosa(this, juego.jugador);
                }
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                if (HelperClass.verificarPrecio(juego.jugador, 30, this)) {
                        juego.tienda.venderComida(juego.jugador, new Cereal());
                        HelperClass.compraExitosa(this, juego.jugador);
                }
        }// GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
                if (HelperClass.verificarPrecio(juego.jugador, 50, this)) {
                        juego.tienda.venderComida(juego.jugador, new Waffle());
                        HelperClass.compraExitosa(this, juego.jugador);
                }
        }// GEN-LAST:event_jButton3ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        // End of variables declaration//GEN-END:variables
}
