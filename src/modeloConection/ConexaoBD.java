
package modeloConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class ConexaoBD {
    
  
       private Connection con;
       


         public static  Connection getConnection(){
         
        Connection con = null;
       
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5434/postgres","postgres","123");
            //
            //JOptionPane.showMessageDialog(null, "Concectado.");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro na conexão.");
        }
        return con;
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

 
    
    

