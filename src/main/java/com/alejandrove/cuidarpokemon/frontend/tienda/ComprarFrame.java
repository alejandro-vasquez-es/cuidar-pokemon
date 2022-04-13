/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandrove.cuidarpokemon.frontend.tienda;

import com.alejandrove.cuidarpokemon.backend.Mascota;
import com.alejandrove.cuidarpokemon.backend.MotorJuego;
import com.alejandrove.cuidarpokemon.backend.helpers.Get;
import com.alejandrove.cuidarpokemon.backend.helpers.HelperClass;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class ComprarFrame extends javax.swing.JFrame {

        JFrame parent;
        MotorJuego juego;

        /**
         * Creates new form ComprarFrame
         * 
         * @param parent
         * @param juego
         */
        public ComprarFrame(JFrame parent, MotorJuego juego) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        apodoTextField = new javax.swing.JTextField();
        idPokemonSpnr = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprar Pokemon");

        jButton10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton10.setText("Regresar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setText("Comprar el pokemon con el número de pokedex:");

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setText("Qué apodo deseasa ponerle a tu mascota?");

        apodoTextField.setText("severus");

        idPokemonSpnr.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        idPokemonSpnr.setEditor(new javax.swing.JSpinner.NumberEditor(idPokemonSpnr, ""));
        idPokemonSpnr.setFocusCycleRoot(true);
        idPokemonSpnr.setValue(23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(apodoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(idPokemonSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(idPokemonSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apodoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
                this.setVisible(false);
                parent.setVisible(true);
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton10ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                if (HelperClass.verificarPrecio(juego.jugador, 50, this)) {
                        if ("".equals(apodoTextField.getText())) {
                                JOptionPane.showMessageDialog(
                                                this,
                                                "Debe indicarle un apodo al pokemon",
                                                "Apodo Pokemon",
                                                JOptionPane.ERROR_MESSAGE);
                                apodoTextField.requestFocus();
                        } else if (idPokemonSpnr.getValue().toString() == "0"
                                        || Integer.valueOf(idPokemonSpnr.getValue().toString()) > 151) {
                                JOptionPane.showMessageDialog(
                                                this,
                                                "El pokemon debe tener un id entre 1-151 porque son de primera generación",
                                                "Id Pokemón",
                                                JOptionPane.ERROR_MESSAGE);
                                idPokemonSpnr.requestFocus();
                        } else {
                                String apodoPokemon = apodoTextField.getText();
                                int idPokemon = Integer.valueOf(idPokemonSpnr.getValue().toString());
                                String[] data = Get.nameAndUrl(idPokemon);
                                String mensaje = "¿Estás seguro de comprar al pokemon No. " + idPokemon + " llamado "
                                                + data[0];
                                int confirmacion = JOptionPane.showConfirmDialog(
                                                this,
                                                mensaje,
                                                "Confirmación",
                                                JOptionPane.YES_NO_OPTION);
                                if (confirmacion == 0) {
                                        try {
                                                juego.tienda.venderPokemon(idPokemon, data, apodoPokemon,
                                                                juego.jugador);
                                                HelperClass.compraExitosa(this, juego.jugador);
                                                juego.jugador.mascotas[juego.jugador.getTotalMascotas() - 1].nacer();
                                        } catch (NullPointerException ex) {
                                                JOptionPane.showMessageDialog(
                                                                this,
                                                                "No se pudo realizar esta acción, ya no tienes espacio para más pokemon",
                                                                "No hay espacio",
                                                                JOptionPane.ERROR_MESSAGE);
                                        }
                                }
                        }
                }
        }// GEN-LAST:event_jButton1ActionPerformed

        /**
         * @param args the command line arguments
         */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apodoTextField;
    private javax.swing.JSpinner idPokemonSpnr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
