/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdenner.to;

/**
 *
 * @author gabri
 */
public class Paciente {

    public int getPacienteID() {
        return PacienteID;
    }

    public void setPacienteID(int PacienteID) {
        this.PacienteID = PacienteID;
    }

    public String getDescSintomas() {
        return DescSintomas;
    }

    public void setDescSintomas(String DescSintomas) {
        this.DescSintomas = DescSintomas;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

 
    int PacienteID;
    String DescSintomas;
    String Senha;
    String Usuario;
}
