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
public class ClassePessoa {
    
     public String nome;
     public String sexo;
     public String idade; // Adicionar no diagrama de classes 
     public String email;
     public String telefone;
     public String estado;
     public String cidade;
     public String rua;
     public String bairro;
     public String complemento;
     public String cep;
     public String numCasa;
     private String cpf; // adicionar getters e setters diagrama de classes
     private String rg; // adicionar getters e setters diagrama de classes
     
     public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
     
}
