/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import modeloBeans.ClassePaciente;
import modeloBeans.ClassePessoa;
import modeloDao.DAOPaciente;
import modeloDao.DAOCadastro;
import modeloDao.DAOPessoa;
import modeloBeans.ClasseCadastro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Alk
 */
public class ViewRegistrarLoginPaciente extends javax.swing.JFrame {

    public ViewRegistrarLoginPaciente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jButtonCadastrarPaciente = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtNumCasa = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoSintomas = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
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

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, -1));

        jLabelEmail.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelEmail.setText("Email :");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, 30));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 330, -1));

        jLabelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelUsuario.setText("Nome de Usuário:");
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, 20));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 320, 30));

        jLabelEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelEstado.setText("Estado :");
        jPanel1.add(jLabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, -1));

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 330, -1));

        jLabelIdade.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelIdade.setText("Idade :");
        jPanel1.add(jLabelIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        txtIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 330, -1));

        jLabelCidade.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCidade.setText("Cidade :");
        jPanel1.add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 330, -1));

        jLabelTelefone.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelTelefone.setText("Telefone :");
        jPanel1.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 330, -1));

        jLabelSenha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha:");
        jPanel1.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 320, 30));

        jButtonCadastrarPaciente.setText("CADASTRAR");
        jButtonCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastarPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 440, 820, 50));
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 360, 25));

        jLabelCpf.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabelCpf.setText("CPF :");
        jPanel1.add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 40));
        jPanel1.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 360, 25));
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 360, 25));
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 330, 23));
        jPanel1.add(txtNumCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 260, 25));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 330, 23));
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 260, 25));
        jPanel1.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 330, 25));

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 340, 50));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setText("para seu acesso ao sistema:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 30));

        txtDescricaoSintomas.setColumns(20);
        txtDescricaoSintomas.setLineWrap(true);
        txtDescricaoSintomas.setRows(5);
        txtDescricaoSintomas.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescricaoSintomas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 330, 110));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Descrição sintomas :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 480));

        jPanel3.setBackground(new java.awt.Color(13, 130, 203));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO PACIENTE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastarPacienteActionPerformed
           
        ClassePessoa novoClassePessoa = new ClassePessoa(); // instanciando → objeto → classe Paciente                                                
            
            novoClassePessoa.nome = txtNome.getText().trim();
            novoClassePessoa.sexo = txtSexo.getText().trim();
            novoClassePessoa.idade = txtIdade.getText().trim();
            novoClassePessoa.email = txtEmail.getText().trim();
            novoClassePessoa.telefone = txtTelefone.getText().trim();
            novoClassePessoa.estado = txtEstado.getText().trim();
            novoClassePessoa.cidade = txtCidade.getText().trim();
            novoClassePessoa.rua = txtRua.getText().trim();
            novoClassePessoa.bairro = txtBairro.getText().trim();
            novoClassePessoa.numCasa = txtNumCasa.getText().trim();
            novoClassePessoa.complemento = txtComplemento.getText().trim();
            novoClassePessoa.cep = txtCep.getText().trim();
            
            
            novoClassePessoa.setCpf(txtCpf.getText().trim());
            novoClassePessoa.setRg(txtRg.getText().trim());
            
            ClassePaciente novoClassePaciente  =  new ClassePaciente();
            DAOPaciente novoDadosPacienteDAO = new DAOPaciente();  // instanciando → objeto → classe DAOPaciente ( para banco de dados)
            
            novoClassePaciente.descricaoSintomas =  (txtDescricaoSintomas.getText().trim());
             
            ClasseCadastro novoCadastro =  new ClasseCadastro();
            DAOCadastro novoCadastroUsuarioAcessoPacienteDAO = new DAOCadastro(); 
            
            novoCadastro.setUsuario(txtUsuario.getText().trim());
            novoCadastro.setSenha(txtSenha.getText().trim());
            
               DAOPessoa novoCadastroPessoaDAO = new DAOPessoa();
               
            try 
            {
                
                novoCadastroPessoaDAO.CadastroDadosPessoa(novoClassePessoa); 
                novoDadosPacienteDAO.CadastroDadosUsuario(novoClassePaciente);
                novoCadastroUsuarioAcessoPacienteDAO.CadastroAcessoLoginUsuario(novoCadastro);
               
                
                
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
                
            txtNome.setText("");
            txtSexo.setText(""); 
            txtIdade.setText(""); 
            txtEmail.setText(""); 
            txtTelefone.setText(""); 
            txtEstado.setText("");
            txtCidade.setText("");
            txtRua.setText(""); 
            txtBairro.setText("");
            txtComplemento.setText(""); 
            txtCep.setText(""); 
            txtNumCasa.setText(""); 
            txtDescricaoSintomas.setText("");
            txtCpf.setText("");
            txtRg.setText("");
            txtUsuario.setText("");
            txtSenha.setText("");
           
            }
            
    }//GEN-LAST:event_jButtonCadastarPacienteActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        
        {
            public void run() 
            {
                new ViewRegistrarLoginPaciente().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparador;
    public javax.swing.JTextField txtBairro;
    public javax.swing.JTextField txtCep;
    public javax.swing.JTextField txtCidade;
    public javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    public javax.swing.JTextArea txtDescricaoSintomas;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtIdade;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextField txtNumCasa;
    private javax.swing.JTextField txtRg;
    public javax.swing.JTextField txtRua;
    private javax.swing.JPasswordField txtSenha;
    public javax.swing.JTextField txtSexo;
    public javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
