

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modeloBeans.ClasseAgendamento;
import modeloDao.DAOAgendamento;

/**
 *
 * @author Alk
 */
public class ViewRegistrarAgendamento extends javax.swing.JFrame  {

    int Enter = 0;
    String usuarioLogado;
    public  List<ClasseAgendamento> resultado = new ArrayList();
    public ViewRegistrarAgendamento(String userLogado ) {

        initComponents();
        
        usuarioLogado =  userLogado;
        txtNomePacienteAgendado.setEditable(false);
        txtPacienteIdAgendado.setEditable(false);
        txtHoraVisita.setEditable(false);
        txtDataVisita.setEditable(false);
        jListPacientesCadastrados.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadastrarPaciente = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabelPesquisa = new javax.swing.JLabel();
        txtNomePacienteAgendado = new javax.swing.JTextField();
        txtPacienteIdAgendado = new javax.swing.JTextField();
        txtDataVisita = new javax.swing.JTextField();
        txtHoraVisita = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCodigoPaciente = new javax.swing.JLabel();
        jLabelDataVisita = new javax.swing.JLabel();
        jLabelHoraVisita = new javax.swing.JLabel();
        jListPacientesCadastrados = new javax.swing.JList<>();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrarPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCadastrarPaciente.setText("CADASTRAR");
        jButtonCadastrarPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastarPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 710, 50));

        txtPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        jPanel1.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 380, 20));

        jLabelPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelPesquisa.setText("Pesquisa :");
        jPanel1.add(jLabelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));
        jPanel1.add(txtNomePacienteAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 270, -1));
        jPanel1.add(txtPacienteIdAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 110, -1));
        jPanel1.add(txtDataVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, -1));
        jPanel1.add(txtHoraVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 180, -1));

        jLabelNome.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelNome.setText("Nome :");
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        jLabelCodigoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCodigoPaciente.setText("Código Paciente :");
        jPanel1.add(jLabelCodigoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabelDataVisita.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelDataVisita.setText("Data agendada :");
        jPanel1.add(jLabelDataVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, -1));

        jLabelHoraVisita.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelHoraVisita.setText("Horário agendado :");
        jPanel1.add(jLabelHoraVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jListPacientesCadastrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListPacientesCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPacientesCadastradosMouseClicked(evt);
            }
        });
        jPanel1.add(jListPacientesCadastrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 380, 90));

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendente", "Concluída", "Cancelada" }));
        txtStatus.setSelectedIndex(-1);
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 140, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Estado Visita:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 710, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 710, -1));

        jPanel4.setBackground(new java.awt.Color(13, 130, 203));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> <u> Caso deseje alterar os dados de alguma visita clique aqui <u> <html>");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 700, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 470));

        jPanel3.setBackground(new java.awt.Color(13, 130, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR AGENDAMENTO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastarPacienteActionPerformed
        
      
        ClasseAgendamento novoAgendamento = new ClasseAgendamento(); // instanciando → objeto → classe Paciente
        DAOAgendamento novoCadastroAgendamento = new DAOAgendamento();
        
        novoAgendamento.nomePaciente = txtNomePacienteAgendado.getText().trim();
        novoAgendamento.personId =  Integer.parseInt(txtPacienteIdAgendado.getText().trim());
        novoAgendamento.Hora = txtHoraVisita.getText().trim();
        novoAgendamento.Data = txtDataVisita.getText().trim();
        novoAgendamento.Status = (String) txtStatus.getSelectedItem();
        
        String formato = "dd/MM/yyyy";
        java.util.Date date = null;
        
        try {
            date = new SimpleDateFormat(formato).parse(novoAgendamento.Data);
            
        } catch (ParseException ex) {
            Logger.getLogger(ViewRegistrarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        try
        {
     
          novoCadastroAgendamento.CadastroAgendamento(novoAgendamento,usuarioLogado,date);

          JOptionPane.showMessageDialog(null, " O agendamento foi cadastrado com sucesso!");

        }
        catch (Exception ex)
        {

             JOptionPane.showMessageDialog(null, " O agendamento não foi cadastrado com sucesso!");
             

        }

       txtNomePacienteAgendado.setText("");
       txtPacienteIdAgendado.setText("");
       txtDataVisita.setText("");
       txtHoraVisita.setText("");
       txtStatus.setSelectedIndex(-1);
     


     
    }//GEN-LAST:event_jButtonCadastarPacienteActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
     jListPacientesCadastrados.setVisible(false);
     Enter = 1;
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void jListPacientesCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPacientesCadastradosMouseClicked
      int linhaClicada = jListPacientesCadastrados.getSelectedIndex();
       

       DAOAgendamento itemClicado =  new DAOAgendamento();
       
        try {
             List <ClasseAgendamento> setarValores = new ArrayList();
            
              setarValores = itemClicado.ListarItemClicked(linhaClicada,txtPesquisa.getText(),resultado.get(linhaClicada).codigo);
              
              String texto = String.valueOf(setarValores.get(0).personId);
              
              txtNomePacienteAgendado.setText(setarValores.get(0).nomePaciente);   
              txtPacienteIdAgendado.setText(texto);
             
              
              txtHoraVisita.setEditable(true);
              txtDataVisita.setEditable(true);
           
            
          
            
        } catch (Exception ex) {
            Logger.getLogger(ViewRegistrarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            

        
        
    }//GEN-LAST:event_jListPacientesCadastradosMouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        jListPacientesCadastrados.setVisible(false);
        
        DefaultListModel listModel = new DefaultListModel();
       
        if (Enter == 0) {

            DAOAgendamento agendamento = new DAOAgendamento();
         

            try {
                 
                    resultado = agendamento.ListarNomesPacientesCadastradosSistema(txtPesquisa.getText());
                    
                    if (agendamento.mostraMax != 5) {
                        
                
                    for (ClasseAgendamento listapesquisada : resultado) {
                        listModel.addElement(listapesquisada.nomePaciente);
                    }
                    jListPacientesCadastrados.setModel(listModel);
                    
                    jListPacientesCadastrados.setVisible(true);
                    
                      
                } else {
                    
                    jListPacientesCadastrados.setVisible(false);
                    
                }
            } catch (Exception ex) {
                Logger.getLogger(ViewRegistrarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            
            
           Enter = 0;

        }
  
        
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        ViewAlterarAgendamento alterarAgendamento = new ViewAlterarAgendamento(usuarioLogado);
        alterarAgendamento.setVisible(true);
        dispose();


    }//GEN-LAST:event_jLabel4MouseClicked

   /* public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        
        {
            public void run() 
            {
                new ViewRegistrarAgendamento().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCodigoPaciente;
    private javax.swing.JLabel jLabelDataVisita;
    private javax.swing.JLabel jLabelHoraVisita;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisa;
    public javax.swing.JList<String> jListPacientesCadastrados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField txtDataVisita;
    public javax.swing.JTextField txtHoraVisita;
    public javax.swing.JTextField txtNomePacienteAgendado;
    public javax.swing.JTextField txtPacienteIdAgendado;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}






























