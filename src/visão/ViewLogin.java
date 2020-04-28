/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import modeloBeans.ClasseCadastro;
import modeloDao.DAOPaciente;
import modeloDao.DAOLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static java.awt.Color.*;
/**
 *
 * @author 
 */
public class ViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form ViewLogin
     */
    
    private ClasseCadastro login = null;
    
    private DAOPaciente userDAO = new DAOPaciente();
    
    public ViewLogin()
    {
        
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelUsuarioLogin = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabelSenhaLogin = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelSouEquipeDeSaude = new javax.swing.JLabel();
        jLabelSouPaciente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuarioLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelUsuarioLogin.setText("Usuario:");
        jPanel1.add(jLabelUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jtfUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        jLabelSenhaLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelSenhaLogin.setText("Senha:");
        jPanel1.add(jLabelSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnEntrar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 110, 130));

        btnCadastro.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCadastro.setText("Clique no que te corresponde para se cadastrar:");
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jpfSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });
        jpfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(jpfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabelSouEquipeDeSaude.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelSouEquipeDeSaude.setText("<html> <u> + Sou integrante de uma equipe de saúde.</u></html>");
        jLabelSouEquipeDeSaude.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSouEquipeDeSaude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSouEquipeDeSaudeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSouEquipeDeSaudeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSouEquipeDeSaudeMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSouEquipeDeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabelSouPaciente.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabelSouPaciente.setText("<html> <u> + Sou paciente. </u> </html>");
        jLabelSouPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSouPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSouPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSouPacienteMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSouPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 380, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoView1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 520));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
       /*
        usuario = new ClasseClients();
        usuario.setUSER(jtfUsuario.getText());
        usuario.setPASS(jpfSenha.getText());
        try {
            usuario = DAOClient.Logar(usuario);
            JOptionPane.showMessageDialog(null, "Bem vindo " + usuario.getALLNAME()+ " !!! ");
            new TelaPrincipal(usuario,jtfUsuario.getText()).setVisible(true);
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
            jtfUsuario.setText("");
            jpfSenha.setText("");
            Logger.getLogger(ViewClientLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
      /*  login = new ClasseCadastro();
        login.setUsuario(jtfUsuario.getText());
        login.setSenha(jpfSenha.getText());

            try {
                
                login = DAOLogin.checkLogin(login); // não tá funfando
               // JOptionPane.showMessageDialog(null, "Bem vindo " + usuario.getALLNAME()+ " !!! ");
               new TelaPrincipal(login,jtfUsuario.getText()).setVisible(true); // expor nome
                
            } catch (Exception ex) {
                
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
            jtfUsuario.setText("");
            jpfSenha.setText("");
            
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
       
        
        /*ClasseCadastro nomeusuario = new ClasseCadastro();
        
        nomeusuario.setUsuario(jtfUsuario.getText());
        nomeusuario.setSenha(jpfSenha.getText());
        
     
        try 
        {
            ClassePessoa pessoa = new ClassePessoa();
            usuario = DAOLogin.Logar(nomeusuario);
            JOptionPane.showMessageDialog(null, "Bem vindo " + pessoa.nome + " !!! ");
            new TelaPrincipal(usuario).setVisible(true);
            

        } catch (Exception ex) 
        
        {
            
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
            jtfUsuario.setText("");
            jpfSenha.setText("");
            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        */
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
    DAOLogin dao = new DAOLogin();
    
       if(dao.checkLogin(jtfUsuario.getText(), jpfSenha.getText())){
           
           boolean paciente =  false ;
           
        try {
            
            int chaveUsuario = dao.BuscaIdUsuario(jtfUsuario.getText().toString());
            paciente = dao.VerificarTipo(chaveUsuario);
            
            
        } catch (Exception ex) {
            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
           if( paciente == true)
           {
           new TelaPrincipalPaciente(login,jtfUsuario.getText()).setVisible(true);
           this.dispose();

           }
           else
           {
           new TelaPrincipal(login,jtfUsuario.getText()).setVisible(true);
           this.dispose();
           }
       }else{
           JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
            jtfUsuario.setText("");
            jpfSenha.setText("");
           
       }            
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
          
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jpfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaKeyPressed
            /*    if(evt.getKeyCode() ==  KeyEvent.VK_ENTER){
            usuario = new ClasseClients();
            usuario.setUSER(jtfUsuario.getText());
            usuario.setPASS(jpfSenha.getText());
            try {
                usuario = DAOClient.Logar(usuario);
                JOptionPane.showMessageDialog(null, "Bem vindo " + usuario.getALLNAME());
                new TelaPrincipal(usuario,jtfUsuario.getText()).setVisible(true);
                this.dispose();


            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
                jtfUsuario.setText("");
                jpfSenha.setText("");
                Logger.getLogger(ViewClientLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    */
            
           /* if(evt.getKeyCode() ==  KeyEvent.VK_ENTER)
            {
                
                login = new ClasseCadastro();
                
                login.setUsuario(jtfUsuario.getText());
                login.setSenha(jpfSenha.getText());
                
                try
                {
                    
                   login = DAOLogin.Logar(login);
                   ClassePessoa nomedousuario =  new ClassePessoa();
                   JOptionPane.showMessageDialog(null, "Bem vindo " + nomedousuario.nome);
                   new TelaPrincipal(login,jtfUsuario.getText()).setVisible(true);
                 
                   
                }catch(Exception ex)
                {
                      JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
                      jtfUsuario.setText("");
                      jpfSenha.setText("");
            
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
                
                }
                    
                
            }
            /*
        if(evt.getKeyCode() ==  KeyEvent.VK_ENTER)
            {
              ClasseCadastro nomeusuario = new ClasseCadastro();
                
                nomeusuario.setUsuario(jtfUsuario.getText());
                nomeusuario.setSenha(jpfSenha.getText());

                try 
                {

                   DAOLogin.Logar(nomeusuario);
                    ClassePessoa pessoa = new ClassePessoa();
                    JOptionPane.showMessageDialog(null, "Bem vindo " + pessoa.nome);
                    new TelaPrincipal(nomeusuario).setVisible(true);
                    this.dispose();


                } catch (Exception ex)
                
                {
                    
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.", "", JOptionPane.ERROR_MESSAGE);
                    jtfUsuario.setText("");
                    jpfSenha.setText("");
                    Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }*/
    }//GEN-LAST:event_jpfSenhaKeyPressed

    private void btnCadastroPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroPacienteMouseClicked
        ViewRegistrarLoginPaciente CadastroPaciente = new ViewRegistrarLoginPaciente();
        CadastroPaciente.setVisible(true);
        dispose(); // fecha a interface viewPrimeiroForm e abre esta outra         
       
    }//GEN-LAST:event_btnCadastroPacienteMouseClicked

    private void jLabelSouPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSouPacienteMouseEntered
        
        jLabelSouPaciente.setForeground(BLUE);
        
    }//GEN-LAST:event_jLabelSouPacienteMouseEntered

    private void jLabelSouPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSouPacienteMouseExited
        jLabelSouPaciente.setForeground(BLACK);
    }//GEN-LAST:event_jLabelSouPacienteMouseExited

    private void jLabelSouEquipeDeSaudeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSouEquipeDeSaudeMouseEntered
        jLabelSouEquipeDeSaude.setForeground(BLUE);
    }//GEN-LAST:event_jLabelSouEquipeDeSaudeMouseEntered

    private void jLabelSouEquipeDeSaudeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSouEquipeDeSaudeMouseExited
        jLabelSouEquipeDeSaude.setForeground(BLACK);
      
    }//GEN-LAST:event_jLabelSouEquipeDeSaudeMouseExited

    private void jLabelSouEquipeDeSaudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSouEquipeDeSaudeMouseClicked
      
        ViewRegistrarLoginEquipeDeSaude CadastrarEquipeDeSaude = new ViewRegistrarLoginEquipeDeSaude();
      CadastrarEquipeDeSaude.setVisible(true);
      dispose();
      
    }//GEN-LAST:event_jLabelSouEquipeDeSaudeMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSenhaLogin;
    private javax.swing.JLabel jLabelSouEquipeDeSaude;
    private javax.swing.JLabel jLabelSouPaciente;
    private javax.swing.JLabel jLabelUsuarioLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}

