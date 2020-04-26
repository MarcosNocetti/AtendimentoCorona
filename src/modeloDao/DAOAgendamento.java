/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.ClasseAgendamento;
import modeloBeans.ClassePessoa;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOAgendamento {
       
       public int mostraMax = 5;
       
      int[] codigo = new int[5];

       public List<ClasseAgendamento> ListarNomesPacientesCadastradosSistema(String nomePaciente) throws Exception {

        List<ClasseAgendamento> listaPesquisaNomes = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa
        String resultado;
        int i = 0;
 
        try {
            
            if(!nomePaciente.equals("")){
          
            pstm = con.prepareStatement("select * from pessoa where nome like '" + nomePaciente + "%' ORDER BY nome");
            rs = pstm.executeQuery();
            
            
            while(rs.next() && mostraMax != 0){
             ClasseAgendamento agend = new ClasseAgendamento();
             agend.codigo[i] = rs.getInt("personid");
             i++;
               
             agend.nomePaciente = rs.getString("nome");
                
             listaPesquisaNomes.add(agend);
                
             mostraMax--;
              
            }
         
            }
        } catch (SQLException exception) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar dados da pesquisa" + exception);
            
            
        }finally{
            con.close();
            
        }
        
       return listaPesquisaNomes;
    }
    
       
        public List<ClasseAgendamento> ListarItemClicked(int linha,String nomePaciente, int [] resultado) throws Exception {

            
        int resultadoId = resultado[linha];
        
        List<ClasseAgendamento> listaSetarPesquisa = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa
  
        try {
            

            pstm = con.prepareStatement("select * from pessoa where personid = '"+resultadoId+"'");  
            rs = pstm.executeQuery();
            
            
            if(rs.next()){
                
               ClasseAgendamento agendamento = new ClasseAgendamento();
              
               agendamento.personId = (rs.getInt("personid"));
               agendamento.nomePaciente = (rs.getString("nome"));
               
               listaSetarPesquisa.add(agendamento);
              
            }
         
            
        } catch (SQLException exception) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar dados da pesquisa" + exception);
            
            
        }finally{
            con.close();
            
        }
        
       return listaSetarPesquisa;
    }
        
        
      public void CadastroAgendamento (ClasseAgendamento novoAgendamento, String usuarioLogado, java.util.Date date) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        
        String sql = "insert into agendamento ( usuarioregistrador, nomepaciente , datavisita, hora ,status , personid) values (?,?,?,?,?,?)";
        
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            
            ps.setString(1, usuarioLogado);
            ps.setString(2, novoAgendamento.nomePaciente);
            ps.setDate(3,sqlDate);
            ps.setString(4, novoAgendamento.Hora);
            ps.setString(5, novoAgendamento.Status);
            ps.setInt(6, novoAgendamento.personId); // chave estrangeira do paciente
         
       
            ps.executeUpdate();
            
           
        }
       
       
}
      /////////////////////////////////////////// ALTERAR AGENDAMENTO /////////////////////////////////////////////////
              
       public List<ClasseAgendamento> ListarNomesPacientesAgendadosSistema(String nomePaciente) throws Exception {

        List<ClasseAgendamento> listaPesquisaNomes = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa
        String resultado;
        int i = 0;
 
        try {
            
            if(!nomePaciente.equals("")){
          
            pstm = con.prepareStatement("select * from agendamento where nomepaciente like '" + nomePaciente + "%' ORDER BY nomepaciente");
            rs = pstm.executeQuery();
            
            
            while(rs.next() && mostraMax != 0){
                
             ClasseAgendamento agend = new ClasseAgendamento();
             
             agend.codigo[i] = rs.getInt("testeid");
             
             i++;
               
             agend.nomePaciente = rs.getString("nomepaciente");
                
             listaPesquisaNomes.add(agend);
                
             mostraMax--;
              
            }
         
            }
        } catch (SQLException exception) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar dados da pesquisa" + exception);
            
            
        }finally{
            con.close();
            
        }
        
       return listaPesquisaNomes;
    }
       
   public List<ClasseAgendamento> ListarItensAgendadosClicked(int linha,String nomePaciente, int [] resultado) throws Exception {

            
        int resultadoId = resultado[linha];
        
        List<ClasseAgendamento> listaSetarPesquisa = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa
  
        try {
            

            pstm = con.prepareStatement("select * from agendamento where testeid = '"+resultadoId+"'");  
            rs = pstm.executeQuery();
            
            
            if(rs.next()){
                
               ClasseAgendamento agendamento = new ClasseAgendamento();
              
               agendamento.agendamentoId = (rs.getInt("testeid"));
               agendamento.nomePaciente = (rs.getString("nomepaciente"));
               agendamento.Data =  (rs.getString("datavisita"));
               agendamento.Hora = (rs.getString("hora"));
               agendamento.Status = (rs.getString("status"));
              
               listaSetarPesquisa.add(agendamento);
              
            }
         
            
        } catch (SQLException exception) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar dados da pesquisa" + exception);
            
            
        }finally{
            con.close();
            
        }
        
       return listaSetarPesquisa;
    }   
   
   
     public void AlterarAgendamento (ClasseAgendamento alterarAgendamento, String usuarioLogado, java.util.Date date) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());


        String sql = "update agendamento set datavisita = ?, hora = ? ,status = ? , usuarioalterador = ? "
                + "where testeid = '"+alterarAgendamento.agendamentoId+"'";
        
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
           
            ps.setDate(1,sqlDate);
            ps.setString(2, alterarAgendamento.Hora);
            ps.setString(3, alterarAgendamento.Status);
            ps.setString(4, usuarioLogado);
       
            ps.executeUpdate();
            
           
        }
       
       
}
   
   
   
   
      
}


  

