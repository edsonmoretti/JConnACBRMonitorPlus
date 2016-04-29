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
public class XMotivoEvento extends XMotivo {

    private String ChNFe;
    private String NProt;
    private String tpEvento;
    private String xEvento;
    private String nSeqEvento;
    private String CNPJDest;
    private String emailDest;

    public XMotivoEvento(String re) {
        super(re);
    }

    public XMotivoEvento(XMotivo re) {
        super(re);
    }

    public String getChNFe() {
        return ChNFe;
    }

    public void setChNFe(String ChNFe) {
        this.ChNFe = ChNFe;
    }

    public String getNProt() {
        return NProt;
    }

    public void setNProt(String NProt) {
        this.NProt = NProt;
    }

    public String getTpEvento() {
        return tpEvento;
    }

    public void setTpEvento(String tpEvento) {
        this.tpEvento = tpEvento;
    }

    public String getxEvento() {
        return xEvento;
    }

    public void setxEvento(String xEvento) {
        this.xEvento = xEvento;
    }

    public String getnSeqEvento() {
        return nSeqEvento;
    }

    public void setnSeqEvento(String nSeqEvento) {
        this.nSeqEvento = nSeqEvento;
    }

    public String getCNPJDest() {
        return CNPJDest;
    }

    public void setCNPJDest(String CNPJDest) {
        this.CNPJDest = CNPJDest;
    }

    public String getEmailDest() {
        return emailDest;
    }

    public void setEmailDest(String emailDest) {
        this.emailDest = emailDest;
    }

    @Override
    public String toString() {
        return super.toString() + "XMotivoEvento{" + "ChNFe=" + ChNFe + ", NProt=" + NProt + ", tpEvento=" + tpEvento + ", xEvento=" + xEvento + ", nSeqEvento=" + nSeqEvento + ", CNPJDest=" + CNPJDest + ", emailDest=" + emailDest + '}';
    }

}
