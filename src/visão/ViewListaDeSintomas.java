
package visão;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.WHITE;


public class ViewListaDeSintomas extends javax.swing.JFrame {


    public ViewListaDeSintomas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelEntrarSistema = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane1.setText("dsddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("► Sintomas comuns:\n\n• Febre.\n• Cansaço.\n• Tosse seca.\n\n► Outros sintomas que algumas pessoas podem experimentar:\n\n• Dores e dores.\n• Congestão nasal.\n• Coriza.\n• Dor de garganta.\n• Diarréia.\n\nEm média, se leva de cinco a seis dias a partir da data em\nque alguém está infectado com o vírus para que os sintomas  apareçam, no entanto, pode levar até 14 dias.\n");
        jTextArea1.setToolTipText("");
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 500, 270));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Sintomas COVID-19");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista de Sintomas COVID-19");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabelEntrarSistema.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabelEntrarSistema.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEntrarSistema.setText("<html> <u> Clique aqui caso deseje efetuar login ou se cadastrar no sistema </u> </html>");
        jLabelEntrarSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEntrarSistemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEntrarSistemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEntrarSistemaMouseExited(evt);
            }
        });
        getContentPane().add(jLabelEntrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 510, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoView1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEntrarSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarSistemaMouseClicked

        ViewLogin Login = new ViewLogin();
        Login.setVisible(true);
        dispose(); 

    }//GEN-LAST:event_jLabelEntrarSistemaMouseClicked

    private void jLabelEntrarSistemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarSistemaMouseEntered
      jLabelEntrarSistema.setForeground(BLUE);
    }//GEN-LAST:event_jLabelEntrarSistemaMouseEntered

    private void jLabelEntrarSistemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEntrarSistemaMouseExited
        jLabelEntrarSistema.setForeground(WHITE);
    }//GEN-LAST:event_jLabelEntrarSistemaMouseExited

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewListaDeSintomas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEntrarSistema;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
