package com.jdenner.gui.tm;

import com.jdenner.to.Agendamento;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do Agendamento
 *
 */
public class AgendamentoTableModel extends AbstractTableModel {
    //exemplo para criação de tabelas no programa
    private String colunas[] = {"Data","Hora","Status"};
    private List<Agendamento> dados;

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
        Agendamento Agendamento = dados.get(l);
        switch (c) {
            case 0:
                DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                return df2.format(Agendamento.getData());
            case 1:
                DateFormat df1 = new SimpleDateFormat("HH:mm:ss");
                return df1.format(Agendamento.getHora());
            case 2:
                return Agendamento.getStatus();
                 

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

    public void setDados(List<Agendamento> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Agendamento getRowValue(int l) {
        return dados.get(l);
    }
}
