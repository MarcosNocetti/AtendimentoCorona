package com.jdenner.gui;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Janela menu da aplicação
 *
 */
public class EnviarMensagens extends javax.swing.JFrame {
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        desktopPane.setBackground(new java.awt.Color(153, 204, 255));
        desktopPane.setForeground(new java.awt.Color(153, 204, 255));
        desktopPane.setName("btDespesas"); // NOI18N
        desktopPane.setOpaque(false);

        jLabel1.setText("Usuario em uso:");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(730, 590, 80, 40);

        lblUser.setText("User");
        desktopPane.add(lblUser);
        lblUser.setBounds(820, 594, 60, 30);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);
        desktopPane.getAccessibleContext().setAccessibleName("Despesas");

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
