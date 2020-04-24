/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author SL
 */
public class ClasseCadastro {

    public int getCadastroId() {
        return cadastroId;
    }

    public void setCadastroId(int cadastroId) {
        this.cadastroId = cadastroId;
    }
   
   public int cadastroId; 
   private String usuario; // getters and setters
   private String senha; // getters and setters
   
       public String getUsuario() {
        return usuario;
    }

  
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

 
    public String getSenha() {
        return senha;
    }

  
    public void setSenha(String senha) {
        this.senha = senha;
    } 
}
