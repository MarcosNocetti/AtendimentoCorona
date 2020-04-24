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
public class Pessoa {

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String Nome, String Telefone, String Cpf, String Cidade, String Uf, String Email, String Rg, String Rua, String Sexo, String Bairro, String Complemento, String Cep, String numCasa, int idade) {
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Cpf = Cpf;
        this.Cidade = Cidade;
        this.Uf = Uf;
        this.Email = Email;
        this.Rg = Rg;
        this.Rua = Rua;
        this.Sexo = Sexo;
        this.Bairro = Bairro;
        this.Complemento = Complemento;
        this.Cep = Cep;
        this.numCasa = numCasa;
        this.idade = idade;
    }
    String Nome, Telefone, Cpf, Cidade, Uf, Email, Rg, Rua, Sexo, Bairro, Complemento, Cep, numCasa;
    int idade;
}
