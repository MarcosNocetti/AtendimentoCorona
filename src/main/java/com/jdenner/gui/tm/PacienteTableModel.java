package com.jdenner.gui.tm;

import com.jdenner.to.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do Paciente
 *
 * @author Juliano
 */
public class PacienteTableModel extends AbstractTableModel {
    //exemplo para criação de tabelas no programa
    private String colunas[] = {"ID", "Descrição", "Senha","Usuario"};
    private List<Paciente> dados;

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
        Paciente Paciente = dados.get(l);
        switch (c) {
            case 0:
                return Paciente.getPacienteID();
            case 1:
                return Paciente.getDescSintomas();
            case 2:
                return Paciente.getUsuario();
            case 3:
                return Paciente.getSenha();
                 

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

    public void setDados(List<Paciente> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Paciente getRowValue(int l) {
        return dados.get(l);
    }
}
