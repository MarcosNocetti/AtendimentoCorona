
package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class ConexaoBD {
    
  

       public Statement stm; //Responsavel por realizar uma pesquisa no BD
       public ResultSet rs; //Armazenar resultado da pesquisa
       public Connection con;


        public static  Connection getConnection()
        {
        
        Connection con = null;
       
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5434/postgres","postgres","123");
            //JOptionPane.showMessageDialog(null, "Concectado.");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro na conexão.");
        }
        return con;
    }
        
        public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSQL " + ex.getMessage());
        }
    }  
         
    public void confirmar() throws SQLException {
        try {
            con.commit();
        } catch (SQLException e) {
            throw new SQLException("Problemas no SQL.\n" + e.getMessage());
        } finally {
            con.close();
        }
    }

}

 
    
    

