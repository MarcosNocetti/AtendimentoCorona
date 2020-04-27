
package visão;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.WHITE;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloBeans.ClasseForum;
import modeloDao.DAOForum;


public class ViewEnviarMensagens extends javax.swing.JFrame {

    String usuarioLogado;
    
    public ViewEnviarMensagens(String userLogado) {
        initComponents();
        usuarioLogado = userLogado;
        txtForum.setEditable(false);
        DAOForum forum = new DAOForum();
        List <ClasseForum> listadadosforum = new ArrayList();
        try {
            
            listadadosforum = forum.ListarDados();
            
             for (ClasseForum listardados : listadadosforum){
               
                txtForum.append(listardados.userMensagem);
                txtForum.append(" (");
                txtForum.append(listardados.tipouser);
                txtForum.append(" ) : ");
                txtForum.append(listardados.mensagem);
                txtForum.append("\n");
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewEnviarMensagens.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtForum = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();

        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane1.setText("dsddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escreva sua mensagem :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        txtMensagem.setColumns(20);
        txtMensagem.setLineWrap(true);
        txtMensagem.setRows(5);
        txtMensagem.setWrapStyleWord(true);
        txtMensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMensagem.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 470, 90));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton1.setText("Enviar Mensagem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarMensagem(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 470, -1));

        txtForum.setColumns(20);
        txtForum.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtForum.setLineWrap(true);
        txtForum.setRows(5);
        txtForum.setToolTipText("");
        txtForum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtForum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtForum.setEnabled(false);
        jScrollPane2.setViewportView(txtForum);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 680, 330));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aba de comunicação - \"Fórum\"");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoView1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 600));
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 370, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarMensagem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarMensagem
   
        
        ClasseForum enviarmensagens = new ClasseForum();
        
        
        enviarmensagens.userMensagem = usuarioLogado;
        enviarmensagens.mensagem =  txtMensagem.getText();
        
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        
        String horarioEnvioMensagem =  hora + ":" + minuto;
        
        Date data = new Date(System.currentTimeMillis());
        
        
        enviarmensagens.data = data;
        enviarmensagens.hora = horarioEnvioMensagem;
        
        DAOForum forum = new DAOForum();
        boolean paciente = false;
        
        int chaveEstrangeiraUsuarioMensagem = 0;
        
        try {
            
            List <ClasseForum> listaultimodado = new ArrayList();
            
            chaveEstrangeiraUsuarioMensagem = forum.BuscaIdUsuarioMensagem(enviarmensagens.userMensagem);
            
            paciente = forum.VerificarTipo(chaveEstrangeiraUsuarioMensagem);
            
            if(paciente == true){
            
            String tipo = "Paciente";
            
            forum.CadastroMensagem(enviarmensagens,chaveEstrangeiraUsuarioMensagem,tipo);
            
            listaultimodado = forum.ListarUltimoDadoescrito();
            
            for (ClasseForum listarultimodado : listaultimodado){
               
                txtForum.append(listarultimodado.userMensagem);
                txtForum.append(" (");
                txtForum.append(listarultimodado.tipouser);
                txtForum.append(" ) : ");
                txtForum.append(listarultimodado.mensagem);
                txtForum.append("\n");
               
            }
            
            
            
            }else{
                
            String tipo = "Equipe de Saúde";
                
            forum.CadastroMensagem(enviarmensagens,chaveEstrangeiraUsuarioMensagem,tipo);
             
             listaultimodado= forum.ListarDados();
            
              for (ClasseForum listarultimodado : listaultimodado){
               
                txtForum.append(listarultimodado.userMensagem);
                txtForum.append(" (");
                txtForum.append(listarultimodado.tipouser);
                txtForum.append(" ) : ");
                txtForum.append(listarultimodado.mensagem);
                txtForum.append("\n");
            }
            
            
            }
            
            
        } catch (Exception ex) {
            
            
            Logger.getLogger(ViewEnviarMensagens.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
        
        txtMensagem.setText("");
        
        
    }//GEN-LAST:event_jButtonEnviarMensagem

   /* public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEnviarMensagens().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JTextArea txtForum;
    public javax.swing.JTextArea txtMensagem;
    // End of variables declaration//GEN-END:variables
}
