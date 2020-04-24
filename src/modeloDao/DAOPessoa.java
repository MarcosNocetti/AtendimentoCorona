/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;


import modeloBeans.ClassePessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOPessoa {
    
       public void CadastroDadosPessoa (ClassePessoa novaPessoa) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
        
       
        // String sql = "insert into tbpessoa (nome,sexo,idade,email,telefone,estado,cidade,rua,bairro,complemento,cep,numCasa,cpf,rg) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        String sql = "insert into pessoa (nome,sexo,idade,email,telefone,estado,cidade,rua,bairro,numcasa,complemento,cep,cpf,rg) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
         
           
            ps.setString(1, novaPessoa.nome);
            ps.setString(2, novaPessoa.sexo);
            ps.setString(3, novaPessoa.idade);
            ps.setString(4, novaPessoa.email);
            ps.setString(5, novaPessoa.telefone);
            ps.setString(6, novaPessoa.estado);
            ps.setString(7, novaPessoa.cidade);
            ps.setString(8, novaPessoa.rua);
            ps.setString(9, novaPessoa.bairro);
            ps.setString(10, novaPessoa.numCasa);
            ps.setString(11, novaPessoa.complemento);           
            ps.setString(12, novaPessoa.cep);
            ps.setString(13, novaPessoa.getCpf());
            ps.setString(14, novaPessoa.getRg());
            
            ps.executeUpdate();
            
           
        }
        
    }
        
    
    
    
}
