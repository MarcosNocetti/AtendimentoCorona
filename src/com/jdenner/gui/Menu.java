package com.jdenner.gui;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Janela menu da aplicação
 *
 */
public class Menu extends javax.swing.JFrame {
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        desktopPane.setBackground(new java.awt.Color(153, 204, 255));
        desktopPane.setForeground(new java.awt.Color(153, 204, 255));
        desktopPane.setName("btDespesas"); // NOI18N
        desktopPane.setOpaque(false);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);
        desktopPane.getAccessibleContext().setAccessibleName("Despesas");

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    // End of variables declaration//GEN-END:variables
}
