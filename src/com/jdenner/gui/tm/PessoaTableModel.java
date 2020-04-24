package com.jdenner.gui.tm;

import com.jdenner.to.Pessoa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do Pessoa
 *
 */
public class PessoaTableModel extends AbstractTableModel {
    //exemplo para criação de tabelas no programa
    private String colunas[] = {"Nome", "Telefone", "CPF","Cidade","UF","Rua","NumCasa", "Bairro","Complemento","CEP","RG","Sexo","Idade"};
    private List<Pessoa> dados;

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
        Pessoa Pessoa = dados.get(l);
        switch (c) {
            case 0:
                return Pessoa.getNome();
            case 1:
                return Pessoa.getTelefone();
            case 2:
                return Pessoa.getCpf();
            case 3:
                return Pessoa.getCidade();
            case 4:
                return Pessoa.getUf();
            case 5:
                return Pessoa.getRua();
            case 6:
                return Pessoa.getNumCasa();
            case 7:
                return Pessoa.getBairro();
            case 8:
                return Pessoa.getComplemento();
            case 9:
                return Pessoa.getCep();
            case 10:
                return Pessoa.getRg();
            case 11:
                return Pessoa.getSexo();
            case 12:
                return Pessoa.getIdade();
                 
                 
            
                 

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

    public void setDados(List<Pessoa> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Pessoa getRowValue(int l) {
        return dados.get(l);
    }
}
