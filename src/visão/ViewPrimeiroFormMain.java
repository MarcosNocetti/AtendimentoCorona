/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import javax.swing.ImageIcon;

/**
 *
 * @author 
 */
public class ViewPrimeiroFormMain extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar
     */
    
    public ViewPrimeiroFormMain() {
        
        initComponents();
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFundoView = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo3View1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 102, 204));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shut-down.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 40));

        jButtonEntrar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(13, 130, 203));
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/covidicon.png"))); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEntrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 280, 200));

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Aplicativo OMS - COVID-19");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabelFundoView.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabelFundoView.setForeground(new java.awt.Color(51, 153, 255));
        jLabelFundoView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoView1.png"))); // NOI18N
        getContentPane().add(jLabelFundoView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
       // ENcaminhar para outra tela (classe)

        ViewListaDeSintomas ListaSintomas = new ViewListaDeSintomas();
        ListaSintomas.setVisible(true);
        dispose(); // fecha a interface viewPrimeiroForm e abre esta outra
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        //SAIR
        
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrimeiroFormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFundoView;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables



}

