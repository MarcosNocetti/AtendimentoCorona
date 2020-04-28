/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import modeloBeans.ClasseEquipeSaude;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOEquipeDeSaude {
      
        public void CadastroDadosEquipeDeSaude (ClasseEquipeSaude novoEquipeDeSaude, int chaveEstrangeiraPessoa) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
        
        String sql = "insert into equipedesaude (codigoespecial,personid) values (?,?)";
        con.getConnection();
        
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
         
           
            ps.setString(1, novoEquipeDeSaude.getCodigoEspecial());
            ps.setInt(2, chaveEstrangeiraPessoa);
           
            ps.executeUpdate();
            
           
        }
        
    }
        
        
}
