/** To change this license header, choose License Headers in Project Properties.* To change this template file, choose Tools | Templates* and open the template in the editor. */package modeloDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modeloBeans.ClasseCidade;
import modeloConection.ConexaoBD;
import visão.ViewRegistrarLoginEquipeDeSaude;

/**
 * ** @author SL
 */
public class DAOCidades {

    public List<ClasseCidade> ListarCidades(String uf) throws Exception {

        List<ClasseCidade> listaCidades = new ArrayList<>();

        Connection con = ConexaoBD.getConnection();
        PreparedStatement pstm = null; //Responsavel por realizar uma pesquisa no BD
        ResultSet rs = null; //Armazenar resultado da pesquisa

        try {
            pstm = con.prepareStatement("select * from cidades where estado ='" + uf + "'");
            rs = pstm.executeQuery();

            while (rs.next()) {

                ClasseCidade listaCidade = new ClasseCidade();
                listaCidade.nomeCidade = (rs.getString(3));

                listaCidades.add(listaCidade);

            }

        } catch (SQLException exception) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar a pesquisa" + exception);

        } finally {
            con.close();

        }

        return listaCidades;
    }
}
