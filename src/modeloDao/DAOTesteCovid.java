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
import modeloBeans.ClasseTesteCovid;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOTesteCovid {
    
    public int mostraMax = 5;


    public List<ClasseTesteCovid> ListarNomesPacientesAgendadosSistema(String nomePaciente) throws Exception {

        List<ClasseTesteCovid> listaPesquisaNomes = new ArrayList();

        Connection con = ConexaoBD.getConnection();

        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD

        ResultSet rs = null; //Armazenar resultado da pesquisa

        String resultado;

        int i = 0;

        try {

            if (!nomePaciente.equals("")) {

                pstm = con.prepareStatement("select * from agendamento where status = 'Concluída' and nomepaciente like '" + nomePaciente + "%' ORDER BY nomepaciente");

                rs = pstm.executeQuery();

                while (rs.next() && mostraMax != 0) {

                    ClasseTesteCovid mostrar = new ClasseTesteCovid();

                    mostrar.codigo[i] = rs.getInt("agendamentoid");
                    i++;

                    mostrar.nomePaciente = rs.getString("nomepaciente");

                    listaPesquisaNomes.add(mostrar);

                    mostraMax--;

                }

            }
        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar listar dados da pesquisa" + exception);

        } finally {
            con.close();

        }

        return listaPesquisaNomes;
    }

       
        public List<ClasseTesteCovid> ListarItemClickedPacientesAgendados(int linha, String nomePaciente, int [] resultado) throws Exception {

            
        int resultadoId = resultado[linha];
        
        List<ClasseTesteCovid> listaSetarPesquisa = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa
  
        try {
            
            pstm = con.prepareStatement("select * from agendamento where agendamentoid = '"+resultadoId+"'");  
            rs = pstm.executeQuery();
            
            
            if(rs.next()){
                
               ClasseTesteCovid dadospacienteagendado = new ClasseTesteCovid();
              
              dadospacienteagendado.personPacienteId = (rs.getInt("personid"));
              dadospacienteagendado.Idagendamento = (rs.getInt("agendamentoid"));
              dadospacienteagendado.nomePaciente = (rs.getString("nomepaciente"));
               
               listaSetarPesquisa.add(dadospacienteagendado);
              
            }
         
            
        } catch (SQLException exception) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar dados da pesquisa" + exception);
            
            
        }finally{
            con.close();
            
        }
        
       return listaSetarPesquisa;
    }
        
        
      public void CadastroTesteCovid (ClasseTesteCovid novoRegistroTeste, String usuarioLogado) throws Exception{
            
        ConexaoBD con = new ConexaoBD();
       
        String sql = "insert into testecovid ( usuarioregistrador, nomepaciente ,resultado, agendamentoid) values (?,?,?,?)";
        
        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            
            ps.setString(1, usuarioLogado);
            ps.setString(2, novoRegistroTeste.nomePaciente);
            ps.setBoolean(3, novoRegistroTeste.resultado);
            ps.setInt(4, novoRegistroTeste.Idagendamento); // chave estrangeira do paciente
         
       
            ps.executeUpdate();
            
           
        }
       
}
}
