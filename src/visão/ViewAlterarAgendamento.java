

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import modeloBeans.ClasseEquipeSaude;
import modeloDao.DAOCadastro;
import modeloDao.DAOPessoa;
import modeloDao.DAOEquipeDeSaude;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static jdk.nashorn.internal.objects.NativeString.substring;
import modeloBeans.ClasseAgendamento;
import modeloBeans.ClasseCadastro;
import modeloBeans.ClasseCidade;
import modeloBeans.ClassePessoa;
import modeloConection.ConexaoBD;
import modeloDao.DAOAgendamento;
import modeloDao.DAOCidades;

/**
 *
 * @author Alk
 */
public class ViewAlterarAgendamento extends javax.swing.JFrame  {

    int Enter = 0;
    String usuarioLogado;
    public  List<ClasseAgendamento> resultado = new ArrayList();
    public ViewAlterarAgendamento(String userLogado ) {

        initComponents();
        
        usuarioLogado =  userLogado;
        txtNomeAgendado.setEditable(false);
        txtPacienteIdAgendado.setEditable(false);
        txtHoraVisita.setEditable(false);
        txtDataVisita.setEditable(false);
        jListAgendados.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonAlterarAgendado = new javax.swing.JButton();
        txtPesquisaPacientesAgendados = new javax.swing.JTextField();
        jLabelPesquisa = new javax.swing.JLabel();
        txtNomeAgendado = new javax.swing.JTextField();
        txtPacienteIdAgendado = new javax.swing.JTextField();
        txtDataVisita = new javax.swing.JTextField();
        txtHoraVisita = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCodigoPaciente = new javax.swing.JLabel();
        jLabelDataVisita = new javax.swing.JLabel();
        jLabelHoraVisita = new javax.swing.JLabel();
        jListAgendados = new javax.swing.JList<>();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAlterarAgendado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAlterarAgendado.setText("ALTERAR");
        jButtonAlterarAgendado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAlterarAgendado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarAgendamentoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAlterarAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 700, 50));

        txtPesquisaPacientesAgendados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPesquisaPacientesAgendados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaPacientesAgendadosActionPerformed(evt);
            }
        });
        txtPesquisaPacientesAgendados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaPacientesAgendadosKeyReleased(evt);
            }
        });
        jPanel1.add(txtPesquisaPacientesAgendados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 380, 20));

        jLabelPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelPesquisa.setText("Pesquisa :");
        jPanel1.add(jLabelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));
        jPanel1.add(txtNomeAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 260, -1));
        jPanel1.add(txtPacienteIdAgendado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 270, -1));
        jPanel1.add(txtDataVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, -1));
        jPanel1.add(txtHoraVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 180, -1));

        jLabelNome.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelNome.setText("Nome paciente agendado :");
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 20));

        jLabelCodigoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCodigoPaciente.setText("Código Agendamento :");
        jPanel1.add(jLabelCodigoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabelDataVisita.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelDataVisita.setText("Data agendada :");
        jPanel1.add(jLabelDataVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, -1));

        jLabelHoraVisita.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelHoraVisita.setText("Horário agendado :");
        jPanel1.add(jLabelHoraVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jListAgendados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jListAgendados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAgendadosMouseClicked(evt);
            }
        });
        jPanel1.add(jListAgendados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 380, 90));

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendente", "Concluída", "Cancelada" }));
        txtStatus.setSelectedIndex(-1);
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 250, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Estado da visita agendada:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 291, -1, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 710, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 710, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 440));

        jPanel3.setBackground(new java.awt.Color(13, 130, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALTERAR AGENDAMENTO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarAgendamentoActionPerformed
        
      
        ClasseAgendamento novoAgendamento = new ClasseAgendamento(); // instanciando → objeto → classe Paciente
        DAOAgendamento novoCadastroAgendamento = new DAOAgendamento();
        
        novoAgendamento.nomePaciente = txtNomeAgendado.getText().trim();
        novoAgendamento.agendamentoId =  Integer.parseInt(txtPacienteIdAgendado.getText().trim());
        novoAgendamento.Hora = txtHoraVisita.getText().trim();
        novoAgendamento.Data = txtDataVisita.getText().trim();
        novoAgendamento.Status = (String) txtStatus.getSelectedItem();
        
        String formato = "dd/MM/yyyy";
        java.util.Date date = null;
        
        try {
            date = new SimpleDateFormat(formato).parse(novoAgendamento.Data);
            
        } catch (ParseException ex) {
            Logger.getLogger(ViewAlterarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        try
        {
     
          novoCadastroAgendamento.AlterarAgendamento(novoAgendamento,usuarioLogado,date);

          JOptionPane.showMessageDialog(null, " O agendamento foi alterado com sucesso!");

        }
        catch (Exception ex)
        {

             JOptionPane.showMessageDialog(null, " O agendamento não foi alterado com sucesso!");
             

        }

       txtNomeAgendado.setText("");
       txtPacienteIdAgendado.setText("");
       txtDataVisita.setText("");
       txtHoraVisita.setText("");
       txtStatus.setSelectedIndex(-1);
     


     
    }//GEN-LAST:event_jButtonAlterarAgendamentoActionPerformed

    private void txtPesquisaPacientesAgendadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaPacientesAgendadosActionPerformed
     jListAgendados.setVisible(false);
     Enter = 1;
    }//GEN-LAST:event_txtPesquisaPacientesAgendadosActionPerformed

    private void jListAgendadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAgendadosMouseClicked

       int linhaClicada = jListAgendados.getSelectedIndex();
       

       DAOAgendamento itemClicado =  new DAOAgendamento();
       
        try {
             List <ClasseAgendamento> setarValores = new ArrayList();
            
              setarValores = itemClicado.ListarItensAgendadosClicked(linhaClicada,txtPesquisaPacientesAgendados.getText(),resultado.get(linhaClicada).codigo);
              
              String texto = String.valueOf(setarValores.get(0).agendamentoId);
              
              txtPacienteIdAgendado.setText(texto);
              
              txtNomeAgendado.setText(setarValores.get(0).nomePaciente); 
              
              txtHoraVisita.setText(setarValores.get(0).Hora);
              
              txtStatus.setSelectedItem(setarValores.get(0).Status);
              
              
              
                //2020-05-28
                String ano;
                String barra = "/";
                String mes;
                String dia;
                
                 ano = setarValores.get(0).Data.substring ( 0 , 4 );
                 mes = setarValores.get(0).Data.substring ( 5 , 7 );
                 dia = setarValores.get(0).Data.substring ( 8 , 10 );
                 
                String data1 = dia.concat(barra);
                String data2 = data1.concat(mes);
                String data3 = data2.concat(barra);
                String datacompleta = data3.concat(ano);
                
                txtDataVisita.setText(datacompleta);
      
               
              
              //txtDataVisita.setText(setarValores.get(0).Data);
              
          
                                  
              
              txtHoraVisita.setEditable(true);
              txtDataVisita.setEditable(true);
           
            
          
            
        } catch (Exception ex) {
            Logger.getLogger(ViewAlterarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            

        
        
    }//GEN-LAST:event_jListAgendadosMouseClicked

    private void txtPesquisaPacientesAgendadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPacientesAgendadosKeyReleased
        jListAgendados.setVisible(false);
        
        DefaultListModel listModel = new DefaultListModel();
       
        if (Enter == 0) {

            DAOAgendamento agendamento = new DAOAgendamento();
         

            try {
                 
                    resultado = agendamento.ListarNomesPacientesAgendadosSistema(txtPesquisaPacientesAgendados.getText());
                    
                    if (agendamento.mostraMax != 5) {
                        
                    for (ClasseAgendamento listapesquisada : resultado) {
                        
                        listModel.addElement(listapesquisada.nomePaciente);
                        
                    }
                    
                    jListAgendados.setModel(listModel);
                    
                    jListAgendados.setVisible(true);
                    
                      
                } else {
                    
                    jListAgendados.setVisible(false);
                    
                }
            } catch (Exception ex) {
                Logger.getLogger(ViewAlterarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            
            
           Enter = 0;

        }
  
        
    }//GEN-LAST:event_txtPesquisaPacientesAgendadosKeyReleased

  /*  public static void main(String args[]) 
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
    private javax.swing.JButton jButtonAlterarAgendado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCodigoPaciente;
    private javax.swing.JLabel jLabelDataVisita;
    private javax.swing.JLabel jLabelHoraVisita;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisa;
    public javax.swing.JList<String> jListAgendados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField txtDataVisita;
    public javax.swing.JTextField txtHoraVisita;
    public javax.swing.JTextField txtNomeAgendado;
    public javax.swing.JTextField txtPacienteIdAgendado;
    private javax.swing.JTextField txtPesquisaPacientesAgendados;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}






























