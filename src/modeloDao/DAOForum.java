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
import modeloBeans.ClasseForum;
import modeloConection.ConexaoBD;

/**
 *
 * @author SL
 */
public class DAOForum {

    public int BuscaIdUsuarioMensagem(String usuarioMensagem) throws Exception {

        String sql = ("select * from cadastro_usuario where usuario ='" + usuarioMensagem + "'");

        ConexaoBD con = new ConexaoBD();

        PreparedStatement ps = con.getConnection().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        int guardaforeignkeyUsuarioMensagem = 0;

        if (rs.next()) {

            guardaforeignkeyUsuarioMensagem = (rs.getInt(1));

        }

        rs.close();
        ps.close();

        return guardaforeignkeyUsuarioMensagem;
    }
    
    
    
    public boolean VerificarTipo(int chaveusuarioMensagem) throws Exception {

        String sql = ("SELECT * from public.cadastro_usuario as cad\n" +
                      "INNER JOIN public.paciente as pac\n" +
                      "on pac.personid = cad.personid and cad.usuarioid ='" + chaveusuarioMensagem + "'");

        ConexaoBD con = new ConexaoBD();

        PreparedStatement ps = con.getConnection().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        boolean check = false;

        if (rs.next()) {

         check = true;

        }

        rs.close();
        ps.close();

        return check;
    }


    public void CadastroMensagem(ClasseForum novamensagem, int foreignkeyUsuarioMensagem , String tipo) throws Exception {

        ConexaoBD con = new ConexaoBD();

        //java.sql.Date sqlDate = new java.sql.Date(novamensagem.data.getTime());
        String sql = "insert into forum ( usuariomensagem, mensagem , datamensagem, horamensagem , usuarioid, tipousuario) values (?,?,?,?,?,?)";

        try (PreparedStatement ps = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, novamensagem.userMensagem);
            ps.setString(2, novamensagem.mensagem);
            ps.setDate(3, novamensagem.data);
            ps.setString(4, novamensagem.hora);
            ps.setInt(5, foreignkeyUsuarioMensagem);
            ps.setString(6, tipo);
            
            ps.executeUpdate();

        }
    }
    
    
    public List<ClasseForum> ListarDados() throws Exception {

        List<ClasseForum> listadados = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa

        try {
            pstm = con.prepareStatement("select * from forum order by forumid");
            rs = pstm.executeQuery();

            while (rs.next()) {

                ClasseForum listadadosforum = new ClasseForum();
                listadadosforum.userMensagem = (rs.getString("usuariomensagem"));
                listadadosforum.tipouser = (rs.getString("tipousuario"));
                listadadosforum.mensagem = (rs.getString("mensagem"));

                listadados.add(listadadosforum);

            }

        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar os dados" + exception);

        } finally {
            con.close();

        }

        return listadados;
    }
    
    
    
     public List<ClasseForum> ListarUltimoDadoescrito() throws Exception {

        List<ClasseForum> listaUltimoDadoEnviado = new ArrayList();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa

        try {
            pstm = con.prepareStatement("select * from forum where forumid = (select max(forumid) from forum)");
            rs = pstm.executeQuery();

            while (rs.next()) {

                ClasseForum listaultimodado = new ClasseForum();
                listaultimodado.userMensagem = (rs.getString("usuariomensagem"));
                listaultimodado.tipouser = (rs.getString("tipousuario"));
                listaultimodado.mensagem = (rs.getString("mensagem"));

                listaUltimoDadoEnviado.add(listaultimodado);

            }

        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar os dados" + exception);

        } finally {
            con.close();

        }

        return listaUltimoDadoEnviado;
    }

}

