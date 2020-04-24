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
public class Equipe_de_Saude {

    public Equipe_de_Saude(int IntegranteEquipeID, String Senha, String Usuario, String CodigoEspecial) {
        this.IntegranteEquipeID = IntegranteEquipeID;
        this.Senha = Senha;
        this.Usuario = Usuario;
        this.CodigoEspecial = CodigoEspecial;
    }

    public int getIntegranteEquipeID() {
        return IntegranteEquipeID;
    }
    int IntegranteEquipeID;
    String Senha;
    String Usuario;
    String CodigoEspecial ;

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

    public String getCodigoEspecial() {
        return CodigoEspecial;
    }

    public void setCodigoEspecial(String CodigoEspecial) {
        this.CodigoEspecial = CodigoEspecial;
    }
}
