/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edsonmoretti.acbr.monitorplus.comunicador.nfe;

/**
 *
 * @author Edson
 */
public class NFCe extends NFeVO {

    public NFCe(InfNfe infNfe, Identificacao Identificacao, Emitente Emitente, Avulsa Avulsa, Destinatario Destinatario, Retirada Retirada, Entrega Entrega) {
        super(infNfe, Identificacao, Emitente, Avulsa, Destinatario, Retirada, Entrega);
    }

}
