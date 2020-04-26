/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloBeans.ClassePaciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloBeans.ClasseCadastro;
import modeloConection.ConexaoBD;

/**
 *
 * @author 
 */
public class DAOPaciente {
    
    
        public void CadastroDadosUsuario (ClassePaciente novoPaciente,int chaveEstrangeiraPessoa) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
        
        String sql = "insert into paciente (descricaoSintomas,personid) values (?,?)";
        
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
         
            ps.setString(1, novoPaciente.descricaoSintomas);
            ps.setInt(2, chaveEstrangeiraPessoa);
            
            ps.executeUpdate();
            
           
        }
        
    }
        
        
    
    /*
        public static ClassePaciente verificaLogin(ClassePaciente login) throws Exception{
            
        String sql = "select * from cadastro_usuario where usuario = ? and senha = ? ";
       
        ConexaoBD con = new ConexaoBD();
        
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        
        ps.setString(1, login.getUSER());
        ps.setString(2, login.getPASS());

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            ClassePaciente user = new ClassePaciente();
            
            user.setCOD_IMOVEL(rs.getInt(1));
            user.setALLNAME(rs.getString(2));
            user.setEMAIL(rs.getString(3));
            user.setIDADE(rs.getString(4));
            user.setESTADO(rs.getString(5));
            user.setALLCITY(rs.getString(6));
            user.setTELEFONE(rs.getString(7));
            user.setUSER(rs.getString(8));
            user.setPASS(rs.getString(9));
            

            return user;
        }
        rs.close();
        ps.close();

        return null;
    }
    /*
        public ArrayList<ClassePaciente> listarTodos() throws Exception {
        ConexaoBD con = new ConexaoBD();
        String sql = "select * from Cadastro_Usuario";
        PreparedStatement ps = con.getConnection().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        
        ArrayList ListaAnuncio = new ArrayList();
        while (rs.next()) {
            ClassePaciente anuncio = new ClassePaciente();
 
            anuncio.setCOD_IMOVEL(rs.getInt(1));
            anuncio.setALLNAME(rs.getString(2));
            anuncio.setEMAIL(rs.getString(3));
            anuncio.setIDADE(rs.getString(4));
            anuncio.setESTADO(rs.getString(5));
            anuncio.setALLCITY(rs.getString(6));
            anuncio.setTELEFONE(rs.getString(7));
            anuncio.setUSER(rs.getString(8));
            anuncio.setPASS(rs.getString(9));


            
            ListaAnuncio.add(anuncio);
        }

        return ListaAnuncio;
    }
        */
          /*
        public static ClasseCadastro verificaLogin(ClasseCadastro login) throws Exception{
            
        String sql = "select * from cadastro_usuario where usuario = ? and senha = ? ";
       
        ConexaoBD con = new ConexaoBD();
        
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        
        ps.setString(1, login.getUsuario());
        ps.setString(2, login.getSenha());

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            
            ClasseCadastro usuario = new ClasseCadastro();
            
            usuario.setUsuario(rs.getString(1));
            usuario.setSenha(rs.getString(2));
            
            return usuario;
        }
        
        rs.close();
        ps.close();

        return null;
    }
            
        */

        
        }
