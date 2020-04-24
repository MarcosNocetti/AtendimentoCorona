/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


//Obs:O que é um ArrayList: É uma coleção simples que pode armazenar qualquer tipo de objeto
public class ModeloTabela extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModeloTabela(ArrayList lin, String[] col) {

        setLinhas(lin);
        setColunas(col);
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public int getColumnCount() {//Irá contar o numero de colunas
        return colunas.length;

    }

    public int getRowCount() {//Responsavel por contar quantas linhas irá ter no Array
        return linhas.size();
    }

    public String getColumnName(int numCol) {//Responsavel por contar quantas linhas irá ter no Array
        return colunas[numCol];
    }

    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }

}
