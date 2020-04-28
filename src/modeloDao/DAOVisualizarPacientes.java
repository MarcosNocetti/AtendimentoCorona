/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOVisualizarPacientes {
   
    
    
    /*
     public int ListarDadosPaciente () throws Exception{
        
        
        String sql =  ("SELECT * from public.pessoa as p\n" +
       "INNER JOIN public.paciente as pac\n" +
       "on p.personid = pac.personid ");
       
        ConexaoBD con = new ConexaoBD();
        
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
       // DefaultTableModel modelo = ( DefaultTableModel) tbpaciente.getModel();
       // modelo.setNumRows(0);
          
       
        while(rs.next()){
           
            //modelo.addRow(new Object[](){rs.getString("Nome Completo")getClass,rs.getString("Sexo")});
            
            DAOPessoa pessoapaciente =  new DAOPessoa();
                
                
                
            }
            
            
        }
        
        rs.close();
        ps.close();
        
        

        return guardaforeignkeyPacienteCadastradoAtual;
    }
       
   

    */
    
}
