/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.awt.event.ItemEvent;
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
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import modeloBeans.ClasseCadastro;
import modeloBeans.ClasseCidade;
import modeloBeans.ClassePessoa;
import modeloConection.ConexaoBD;
import modeloDao.DAOCidades;

/**
 *
 * @author Alk
 */
public class ViewRegistrarLoginEquipeDeSaude extends javax.swing.JFrame  {

    public ViewRegistrarLoginEquipeDeSaude() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        txtNomeEquipedeSaude = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        txtEmailEquipedeSaude = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        txtIdadeEquipedeSaude = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        txtTelefoneEquipedeSaude = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jButtonCadastrarPaciente = new javax.swing.JButton();
        txtCpfEquipedeSaude = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        txtRgEquipedeSaude = new javax.swing.JTextField();
        txtCepEquipedeSaude = new javax.swing.JTextField();
        txtNumCasaEquipedeSaude = new javax.swing.JTextField();
        txtBairroEquipedeSaude = new javax.swing.JTextField();
        txtComplementoEquipedeSaude = new javax.swing.JTextField();
        txtRuaEquipedeSaude = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelNumCasa = new javax.swing.JLabel();
        jSeparador = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoEspeciaEquipeDeSaude = new javax.swing.JTextField();
        txtSexoEquipedeSaude = new javax.swing.JComboBox<>();
        txtEstadoEquipedeSaude = new javax.swing.JComboBox<>();
        txtCidadeEquipedeSaude = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNome.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelNome.setText("Nome completo :");
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        txtNomeEquipedeSaude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNomeEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, -1));

        jLabelEmail.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelEmail.setText("Email :");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, 30));

        txtEmailEquipedeSaude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtEmailEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 330, -1));

        jLabelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelUsuario.setText("Nome de Usuário:");
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, 20));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 320, 30));

        jLabelEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelEstado.setText("Estado :");
        jPanel1.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, -1));

        jLabelIdade.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelIdade.setText("Idade :");
        jPanel1.add(jLabelIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        txtIdadeEquipedeSaude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtIdadeEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 330, -1));

        jLabelCidade.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCidade.setText("Cidade :");
        jPanel1.add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabelTelefone.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelTelefone.setText("Telefone :");
        jPanel1.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));

        txtTelefoneEquipedeSaude.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtTelefoneEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 330, -1));

        jLabelSenha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:");
        jPanel1.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 320, 30));

        jButtonCadastrarPaciente.setText("CADASTRAR");
        jButtonCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastarPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 440, 820, 50));
        jPanel1.add(txtCpfEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 360, 25));

        jLabelCpf.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCpf.setText("CPF :");
        jPanel1.add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 40));
        jPanel1.add(txtRgEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 360, 25));
        jPanel1.add(txtCepEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 360, 25));
        jPanel1.add(txtNumCasaEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 260, 25));
        jPanel1.add(txtBairroEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 330, 23));
        jPanel1.add(txtComplementoEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 260, 25));
        jPanel1.add(txtRuaEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 330, 25));

        jLabelSexo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelSexo.setText("Sexo :");
        jPanel1.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 40));

        jLabelRg.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelRg.setText("RG :");
        jPanel1.add(jLabelRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabelRua.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelRua.setText("Rua :");
        jPanel1.add(jLabelRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, 60, 40));

        jLabelBairro.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelBairro.setText("Bairro :");
        jPanel1.add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 40));

        jLabelCep.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCep.setText("CEP :");
        jPanel1.add(jLabelCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 40, 40));

        jLabelComplemento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelComplemento.setText("Complemento :");
        jPanel1.add(jLabelComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 40));

        jLabelNumCasa.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelNumCasa.setText("Número da casa :");
        jPanel1.add(jLabelNumCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 40));

        jSeparador.setForeground(new java.awt.Color(0, 0, 0));
        jSeparador.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 450));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Agora escreva os dados  que serão usados ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 340, 50));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setText("para seu acesso ao sistema:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Código Especial:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 40));
        jPanel1.add(txtCodigoEspeciaEquipeDeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 160, 20));

        txtSexoEquipedeSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        txtSexoEquipedeSaude.setSelectedIndex(-1);
        jPanel1.add(txtSexoEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 330, -1));

        txtEstadoEquipedeSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        txtEstadoEquipedeSaude.setSelectedIndex(-1);
        txtEstadoEquipedeSaude.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtEstadoEquipedeSaudeItemStateChanged(evt);
            }
        });
        jPanel1.add(txtEstadoEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 330, -1));

        txtCidadeEquipedeSaude.setToolTipText("");
        txtCidadeEquipedeSaude.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtCidadeEquipedeSaudeItemStateChanged(evt);
            }
        });
        jPanel1.add(txtCidadeEquipedeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 330, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 480));

        jPanel3.setBackground(new java.awt.Color(13, 130, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR INTEGRANTE EQUIPE DE SAÚDE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastarPacienteActionPerformed
            
           ClassePessoa novoClassePessoa = new ClassePessoa(); // instanciando → objeto → classe Paciente                                                
           DAOPessoa novoCadastroPessoaDAO = new DAOPessoa();
           
            novoClassePessoa.nome = txtNomeEquipedeSaude.getText().trim();
            novoClassePessoa.sexo  =  (String) txtSexoEquipedeSaude.getSelectedItem(); 
            novoClassePessoa.idade = txtIdadeEquipedeSaude.getText().trim();
            novoClassePessoa.email = txtEmailEquipedeSaude.getText().trim();
            novoClassePessoa.telefone = txtTelefoneEquipedeSaude.getText().trim();
            novoClassePessoa.estado = (String) txtEstadoEquipedeSaude.getSelectedItem();
            novoClassePessoa.cidade = (String) txtCidadeEquipedeSaude.getSelectedItem();
            novoClassePessoa.rua = txtRuaEquipedeSaude.getText().trim();
            novoClassePessoa.bairro = txtBairroEquipedeSaude.getText().trim();
            novoClassePessoa.numCasa = txtNumCasaEquipedeSaude.getText().trim();
            novoClassePessoa.complemento = txtComplementoEquipedeSaude.getText().trim();
            novoClassePessoa.cep = txtCepEquipedeSaude.getText().trim();
            
            
            novoClassePessoa.setCpf(txtCpfEquipedeSaude.getText().trim());
            novoClassePessoa.setRg(txtRgEquipedeSaude.getText().trim());
            
            ClasseEquipeSaude novoClasseEquipeDeSaude  =  new ClasseEquipeSaude();
            DAOEquipeDeSaude novoDadosEquipeDeSaudeDAO = new DAOEquipeDeSaude();  // instanciando → objeto → classe DAOPaciente ( para banco de dados)
            
            novoClasseEquipeDeSaude.setCodigoEspecial(txtCodigoEspeciaEquipeDeSaude.getText().trim());
             
            ClasseCadastro novoCadastroEquipeDeSaude =  new ClasseCadastro();
            DAOCadastro novoCadastroUsuarioAcessoPacienteDAO = new DAOCadastro(); 
            
            novoCadastroEquipeDeSaude.setUsuario(txtUsuario.getText().trim());
            novoCadastroEquipeDeSaude.setSenha(txtSenha.getText().trim());
            
            
               
            try 
            {
                
                novoCadastroPessoaDAO.CadastroDadosPessoa(novoClassePessoa); 
                novoDadosEquipeDeSaudeDAO.CadastroDadosEquipeDeSaude(novoClasseEquipeDeSaude);
                novoCadastroUsuarioAcessoPacienteDAO.CadastroAcessoLoginUsuario(novoCadastroEquipeDeSaude);
               
                
                
            } 
            catch (Exception ex) 
            {
                
            Logger.getLogger(ViewRegistrarLoginPaciente.class.getName()).log(Level.SEVERE,null, ex);
            
            }
            
                JOptionPane.showMessageDialog(null, "" + novoClassePessoa.nome+ " foi cadastrado com sucesso!");

         int resposta =   JOptionPane.showConfirmDialog(null, "Deseja Volta a tela de Login?", "Mensagem", YES_NO_OPTION);
         
            if (resposta == JOptionPane.YES_OPTION)
            {
                
                new ViewLogin().setVisible(true); 
                this.dispose();
                
            }
            
            else if(resposta == JOptionPane.NO_OPTION)
            {
                
            txtNomeEquipedeSaude.setText("");
            txtSexoEquipedeSaude.setEnabled(false); 
            txtIdadeEquipedeSaude.setText(""); 
            txtEmailEquipedeSaude.setText(""); 
            txtTelefoneEquipedeSaude.setText(""); 
            txtEstadoEquipedeSaude.setEnabled(false);
            txtCidadeEquipedeSaude.setEnabled(false);
            txtRuaEquipedeSaude.setText(""); 
            txtBairroEquipedeSaude.setText("");
            txtComplementoEquipedeSaude.setText(""); 
            txtCepEquipedeSaude.setText(""); 
            txtNumCasaEquipedeSaude.setText(""); 
            txtCpfEquipedeSaude.setText("");
            txtRgEquipedeSaude.setText("");
            txtCodigoEspeciaEquipeDeSaude.setText("");
            txtUsuario.setText("");
            txtSenha.setText("");
           
            }
            
            
    }//GEN-LAST:event_jButtonCadastarPacienteActionPerformed

    private void txtCidadeEquipedeSaudeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtCidadeEquipedeSaudeItemStateChanged
        
  
    }//GEN-LAST:event_txtCidadeEquipedeSaudeItemStateChanged

    private void txtEstadoEquipedeSaudeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtEstadoEquipedeSaudeItemStateChanged

        if(evt.getStateChange() == ItemEvent.SELECTED){   
            
    
            DAOCidades listacidade = new DAOCidades();
            List<ClasseCidade> cidades = new ArrayList();
            
            try {
                txtCidadeEquipedeSaude.removeAllItems();   

              cidades =  listacidade.ListarCidades(txtEstadoEquipedeSaude.getSelectedItem().toString());
              for (ClasseCidade cidade : cidades) {
                 txtCidadeEquipedeSaude.addItem(cidade.nomeCidade.toString());     
            }
                        
            } catch (Exception ex){
                
                 JOptionPane.showMessageDialog(null,"Não foi possível listar as cidades" ,"", JOptionPane.ERROR_MESSAGE);
                 
                Logger.getLogger(ViewRegistrarLoginEquipeDeSaude.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
            }//GEN-LAST:event_txtEstadoEquipedeSaudeItemStateChanged

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        
        {
            public void run() 
            {
                new ViewRegistrarLoginEquipeDeSaude().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumCasa;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparador;
    public javax.swing.JTextField txtBairroEquipedeSaude;
    public javax.swing.JTextField txtCepEquipedeSaude;
    public javax.swing.JComboBox<String> txtCidadeEquipedeSaude;
    private javax.swing.JTextField txtCodigoEspeciaEquipeDeSaude;
    public javax.swing.JTextField txtComplementoEquipedeSaude;
    private javax.swing.JTextField txtCpfEquipedeSaude;
    public javax.swing.JTextField txtEmailEquipedeSaude;
    public javax.swing.JComboBox<String> txtEstadoEquipedeSaude;
    public javax.swing.JTextField txtIdadeEquipedeSaude;
    public javax.swing.JTextField txtNomeEquipedeSaude;
    public javax.swing.JTextField txtNumCasaEquipedeSaude;
    private javax.swing.JTextField txtRgEquipedeSaude;
    public javax.swing.JTextField txtRuaEquipedeSaude;
    private javax.swing.JPasswordField txtSenha;
    public javax.swing.JComboBox<String> txtSexoEquipedeSaude;
    public javax.swing.JTextField txtTelefoneEquipedeSaude;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
