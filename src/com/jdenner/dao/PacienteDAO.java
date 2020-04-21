/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdenner.dao;

import com.jdenner.to.Paciente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class PacienteDAO implements IDAO<Paciente>{

    @Override
    public void inserir(Paciente paciente) throws Exception {
        //exemplo de criação pro metodo inserir
        Conexao c = new Conexao();
        String sql = "INSERT INTO TbPaciente (Usuario, Senha, DescSintomas) VALUES (?, ?, ?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, paciente.getUsuario());
        ps.setString(2, paciente.getSenha());
        ps.setString(3, paciente.getDescSintomas());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void alterar(Paciente paciente) throws Exception {
        Conexao c = new Conexao();
        String sql = "UPDATE TbPaciente SET Usuario=?, Senha=?, DescSintomas=? WHERE ID_Paciente=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, paciente.getUsuario());
        ps.setString(2, paciente.getSenha());
        ps.setString(3, paciente.getDescSintomas());
        ps.setInt(4, paciente.getPacienteID());
        ps.execute();
        c.confirmar();
    }

    @Override
    public void excluir(Paciente paciente) throws Exception {
        Conexao c = new Conexao();
        String sql = "DELETE FROM TbPaciente WHERE ID_Paciente=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, paciente.getPacienteID());
        ps.execute();
        c.confirmar();
    }

    @Override
    public ArrayList<Paciente> listarTodos() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM TBCLIENTE ORDER BY NOME";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaClientes = new ArrayList();
        while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setPacienteID(rs.getInt("CODIGO"));
            paciente.setUsuario(rs.getString("Usuario"));
            paciente.setSenha(rs.getString("Senha"));
            paciente.setDescSintomas(rs.getString("Descrição"));
            listaClientes.add(paciente);
        }

        return listaClientes;
    
    }

    @Override
    public Paciente recuperar(int codigo) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();

        Paciente paciente = new Paciente();
        if (rs.next()) {
            paciente.setPacienteID(rs.getInt("CODIGO"));
            paciente.setUsuario(rs.getString("Usuario"));
            paciente.setSenha(rs.getString("Senha"));
            paciente.setDescSintomas(rs.getString("Descrição"));
        }

        return paciente;
    }
    
}
