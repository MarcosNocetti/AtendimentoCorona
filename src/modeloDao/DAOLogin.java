/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modeloBeans.ClasseCadastro;
import modeloConection.ConexaoBD;


import modeloConection.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SL
 */
public class DAOLogin {

    public boolean checkLogin(String usuario, String senha) {

        Connection con = ConexaoBD.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM public.cadastro_usuario WHERE usuario = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return check;

    }


 

}



/**
 *
 * @author SL
 */

/*
public class DAOLogin {
       
    public class DAOPaciente {
           
       public static ClasseCadastro Logar(ClasseCadastro login) throws Exception{
     
        ConexaoBD con = new ConexaoBD();
        
        String sql = "insert into paciente (descricaoSintomas) values (?)";
        
       PreparedStatement ps = con.getConnection().prepareStatement(sql);
       
        try (
         
           
           
        }
        
   
        
       // String sql = "SELECT * FROM public.cadastro_usuario where usuario ='"+login.getUsuario()+ "'";
    
     
             
      
       
        ps.setString(1, login.getUsuario());
        ps.setString(2, login.getSenha());

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            
            ClasseCadastro user = new ClasseCadastro();
            
            user.setUsuario(rs.getString(1));
            user.setSenha(rs.getString(2));
            

            return user;
        }
        rs.close();
        ps.close();

        return null;
    }
}
    
    /*
        public static ClasseCadastro Logar(ClasseCadastro login) throws Exception{
            
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
            
       
}*/
/*
        public static ClasseCadastro Logar(ClasseCadastro login) throws Exception{
        String sql = "select * from public.cadastro_usuario where usuario = ? and senha = ? ";
       
        ConexaoBD con = new ConexaoBD();
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        ps.setString(1, login.getUsuario());
        ps.setString(2, login.getSenha());

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            
        
            ClasseCadastro user = new ClasseCadastro();
            
            user.setCadastroId(rs.getInt(1));
            user.setUsuario(rs.getString(2));
            user.setSenha(rs.getString(3));
            

            return user;
        }
        rs.close();
        ps.close();

        return null;
    }
}
*/








































