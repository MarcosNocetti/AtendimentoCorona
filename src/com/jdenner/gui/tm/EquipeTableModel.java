package com.jdenner.gui.tm;

import com.jdenner.to.Equipe_de_Saude;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do Equipe_de_Saude
 *
 */
public class EquipeTableModel extends AbstractTableModel {
    //exemplo para criação de tabelas no programa
    private String colunas[] = {"ID", "Codigo Especial", "Usuario","Senha"};
    private List<Equipe_de_Saude> dados;

    @Override
    public int getRowCount() {
        if(dados == null){
            return 0;
        }
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Equipe_de_Saude Equipe_de_Saude = dados.get(l);
        switch (c) {
            case 0:
                return Equipe_de_Saude.getIntegranteEquipeID();
            case 1:
                return Equipe_de_Saude.getCodigoEspecial();
            case 2:
                return Equipe_de_Saude.getUsuario();
            case 3:
                return Equipe_de_Saude.getSenha();
                 

            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }

    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Equipe_de_Saude> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Equipe_de_Saude getRowValue(int l) {
        return dados.get(l);
    }
}
