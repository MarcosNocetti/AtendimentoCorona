/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdenner.to;

/**
 *
 * @author gabri
 */
public class TesteCovid {

    public TesteCovid(int TesteID, boolean Resultado) {
        this.TesteID = TesteID;
        this.Resultado = Resultado;
    }

    TesteCovid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isResultado() {
        return Resultado;
    }

    public void setResultado(boolean Resultado) {
        this.Resultado = Resultado;
    }
    int TesteID;

    public int getTesteID() {
        return TesteID;
    }
    boolean Resultado;
}
