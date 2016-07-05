/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto;

/**
 *
 * @author Edson
 */
public enum CNAB {
    CNAB240(0),
    CNAB400(1);

    private final int codigo;

    private CNAB(int cod) {
        this.codigo = cod;
    }

    @Override
    public String toString() {
        return String.valueOf(codigo);
    }

}
