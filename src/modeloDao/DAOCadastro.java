/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloBeans.ClasseCadastro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOCadastro {

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        public void CadastroAcessoLoginUsuario (ClasseCadastro novoUsuario, int foreignKeyPessoa) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
        
        String sql = "insert into cadastro_usuario (usuario, senha,personid) values (?,?,?)";
        
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
         
            ps.setString(1, novoUsuario.getUsuario());
            ps.setString(2, novoUsuario.getSenha());
            ps.setInt(3, foreignKeyPessoa);
            
       
            ps.executeUpdate();
            
           
        }
    }
   
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        
 
       
}
