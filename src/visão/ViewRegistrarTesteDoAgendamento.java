   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modeloBeans.ClasseTesteCovid;
import modeloDao.DAOTesteCovid;

/**
 *
 * @author Alk
 */
public class ViewRegistrarTesteDoAgendamento extends javax.swing.JFrame  {

    int Enter = 0;
    String usuarioLogado;
    public  List<ClasseTesteCovid> resultado = new ArrayList();
    public ViewRegistrarTesteDoAgendamento(String userLogado ) {

        initComponents();
        
        usuarioLogado =  userLogado;
        txtNomePaciente.setEditable(false);
        txtPacienteIdAgendado.setEditable(false);
        txtCodAgendamentoPaciente.setEditable(false);
        txtStatus.setEnabled(false);
        jListPacientesAgendados.setVisible(false);
     
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadastrarTestePaciente = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabelPesquisa = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        txtPacienteIdAgendado = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCodigoPaciente = new javax.swing.JLabel();
        jListPacientesAgendados = new javax.swing.JList<>();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtCodAgendamentoPaciente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrarTestePaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCadastrarTestePaciente.setText("CADASTRAR");
        jButtonCadastrarTestePaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCadastrarTestePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastarTestePacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarTestePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 700, 50));

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
        jPanel1.add(txtNomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 240, -1));
        jPanel1.add(txtPacienteIdAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 60, -1));

        jLabelNome.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelNome.setText("Nome Paciente :");
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 20));

        jLabelCodigoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCodigoPaciente.setText("Código Pessoa Paciente :");
        jPanel1.add(jLabelCodigoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, 40));

        jListPacientesAgendados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListPacientesAgendados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPacientesAgendadosMouseClicked(evt);
            }
        });
        jPanel1.add(jListPacientesAgendados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 380, 90));

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        txtStatus.setSelectedIndex(-1);
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 140, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Resultado teste covid-19 :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 710, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 710, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Código do Agendamento do Paciente :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));
        jPanel1.add(txtCodAgendamentoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 310, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 450));

        jPanel3.setBackground(new java.awt.Color(13, 130, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR TESTE COVID-19");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastarTestePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastarTestePacienteActionPerformed
        
      
        ClasseTesteCovid novoCadastroTesteCovid = new ClasseTesteCovid(); // instanciando → objeto → classe Paciente
        DAOTesteCovid novoCadastroTeste= new DAOTesteCovid();
        
        
        novoCadastroTesteCovid.nomePaciente = txtNomePaciente.getText().trim();
        novoCadastroTesteCovid.personPacienteId =  Integer.parseInt(txtPacienteIdAgendado.getText().trim());
        novoCadastroTesteCovid.Idagendamento =  Integer.parseInt(txtCodAgendamentoPaciente.getText().trim());
        
        if (txtStatus.getSelectedItem().toString().equals("Positivo")){
        
            novoCadastroTesteCovid.resultado = true;
        
        }else{
            
            novoCadastroTesteCovid.resultado = false;
        
        }
        
        try
        {
     
          novoCadastroTeste.CadastroTesteCovid(novoCadastroTesteCovid,usuarioLogado);

          JOptionPane.showMessageDialog(null, " O teste do COVID-19 foi cadastrado com sucesso!");

        }
        catch (Exception ex)
        {

             JOptionPane.showMessageDialog(null, " O teste do COVID-19  não foi cadastrado com sucesso!");
             

        }

       txtPesquisa.setText("");
       txtNomePaciente.setText("");
       txtPacienteIdAgendado.setText("");
       txtStatus.setSelectedIndex(-1);
       txtCodAgendamentoPaciente.setText("");


     
    }//GEN-LAST:event_jButtonCadastarTestePacienteActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
     jListPacientesAgendados.setVisible(false);
     Enter = 1;
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void jListPacientesAgendadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPacientesAgendadosMouseClicked
      
       int linhaClicada = jListPacientesAgendados.getSelectedIndex();
       

       DAOTesteCovid itemClicado =  new DAOTesteCovid();
       
        try {
            
             List <ClasseTesteCovid> setarValores = new ArrayList();
            
              setarValores = itemClicado.ListarItemClickedPacientesAgendados(linhaClicada,txtPesquisa.getText(),resultado.get(linhaClicada).codigo);
              
              String agendamentoId = String.valueOf(setarValores.get(0).Idagendamento);
              String idpaciente = String.valueOf(setarValores.get(0).personPacienteId);
                
              txtNomePaciente.setText(setarValores.get(0).nomePaciente);   
              txtCodAgendamentoPaciente.setText(agendamentoId);
              txtPacienteIdAgendado.setText(idpaciente);
          
              txtStatus.setEnabled(true);
            
        } catch (Exception ex) {
            Logger.getLogger(ViewRegistrarTesteDoAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }//GEN-LAST:event_jListPacientesAgendadosMouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        
        jListPacientesAgendados.setVisible(false);
        
        DefaultListModel listModel = new DefaultListModel();
       
        if (Enter == 0) {

            DAOTesteCovid teste = new DAOTesteCovid();
         

            try {
                 
                    resultado = teste.ListarNomesPacientesAgendadosSistema(txtPesquisa.getText());
                    
                    if (teste.mostraMax != 5) {
                        
                
                    for (ClasseTesteCovid listapesquisada : resultado) {
                        
                        listModel.addElement(listapesquisada.nomePaciente);
                        
                    }
                    jListPacientesAgendados.setModel(listModel);
                    
                    jListPacientesAgendados.setVisible(true);
                    
                      
                } else {
                    
                    jListPacientesAgendados.setVisible(false);
                    
                }
                    
            } catch (Exception ex) {
                
                Logger.getLogger(ViewRegistrarTesteDoAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                
            }

        } else {
            
            
           Enter = 0;

        }
  
        
    }//GEN-LAST:event_txtPesquisaKeyReleased

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
    private javax.swing.JButton jButtonCadastrarTestePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCodigoPaciente;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisa;
    public javax.swing.JList<String> jListPacientesAgendados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCodAgendamentoPaciente;
    public javax.swing.JTextField txtNomePaciente;
    public javax.swing.JTextField txtPacienteIdAgendado;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}






























