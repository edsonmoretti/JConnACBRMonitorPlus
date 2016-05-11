package br.com.edsonmoretti.acbr.monitorplus.comunicador.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edson Moretti - www.edsonmoretti.com.br
 */
public class TextUtils {

    public static String lerTagIni(String ler, String deOnde, String chaveTitulo) {
        if (chaveTitulo.endsWith("]") && chaveTitulo.startsWith("[")) {
            chaveTitulo = chaveTitulo.toLowerCase(); //deixando minuscula pra ignorar o case e adicionado o =
        } else {
            chaveTitulo = "[" + chaveTitulo.toLowerCase() + "]"; //deixando minuscula pra ignorar o case e adicionado o =
        }
        String original = deOnde; //guarando a string deOnde original para pegar os dados no formato normal
        deOnde = deOnde.toLowerCase() + "\n"; //deixando minuscula o conteudo do ini pra poder usar a tag minuscula e dando um enter no final para pegar a ultima tag caso n tenha \n, pois o char \n eh usado para saber o final da tag ini
        original = deOnde = original.substring(deOnde.indexOf(chaveTitulo) + 1);
        try {
            original = "[" + original.substring(0, deOnde.indexOf("\n["));
        } catch (Exception e) {

        }
        return lerTagIni(ler, original);
    }

    public static String lerTagIni(String ler, String deOnde) {
        ler = ler.toLowerCase() + "="; //deixando minuscula pra ignorar o case e adicionado o =
        String original = deOnde; //guarando a string deOnde original para pegar os dados no formato normal
        deOnde = deOnde.toLowerCase() + "\n"; //deixando minuscula o conteudo do ini pra poder usar a tag minuscula e dando um enter no final para pegar a ultima tag caso n tenha \n, pois o char \n eh usado para saber o final da tag ini
        int index = deOnde.indexOf(ler); //pegando o index no conteudo INI minusculo
        String temp = original.substring(index + ler.length()); //usando o (index + variavelIni lenght) em minusculo para pegar o conteúdo do INI original

        if (!temp.endsWith("\n")) {
            temp = temp + "\n";
        }

        String retorno = "";
        if (index > -1) {
            int i = 0;
            while (temp.charAt(i) != '\n') { //ler o conteúdo até o achar o \n (final da String da variavel do INI)
                retorno += temp.charAt(i++);
            }
//            System.out.println(ler + retorno);
        }
        return retorno.trim().replace("\r", "");
    }

    public static String lpadZero(int tamanho, int numero) {
        return String.format("%0" + tamanho + "d", numero);
    }

    //USE APENAS PARA TESTES
    public static void main(String[] args) {
        //String ini = "[DESCRICAO]ORIENTACAO=0FONTE=2MULTIPLICADOR_H=2MULTIPLICADOR_V=2VERTICAL=19HORIZONTAL=5[GTIN]ORIENTACAO=0FONTE=1MULTIPLICADOR_H=2MULTIPLICADOR_V=30VERTICAL=13HORIZONTAL=5[R$01]ORIENTACAO=0FONTE=3MULTIPLICADOR_H=3MULTIPLICADOR_V=2VERTICAL=0HORIZONTAL=7[PRECO01]ORIENTACAO=0FONTE=3MULTIPLICADOR_H=4MULTIPLICADOR_V=3VERTICAL=0HORIZONTAL=20[R$02]ORIENTACAO=0FONTE=2MULTIPLICADOR_H=2MULTIPLICADOR_V=2VERTICAL=3HORIZONTAL=5[PRECO02]ORIENTACAO=0FONTE=3MULTIPLICADOR_H=4MULTIPLICADOR_V=3VERTICAL=0HORIZONTAL=40[AMBOSPRECOS][ATACADO]ORIENTACAO=0FONTE=2MULTIPLICADOR_H=2MULTIPLICADOR_V=2VERTICAL=10HORIZONTAL=70[PRECO02]ORIENTACAO=0FONTE=2MULTIPLICADOR_H=2MULTIPLICADOR_V=2VERTICAL=5HORIZONTAL=70";
        String ini = "[STATUS]\n"
                + "Versao=1.07\n"
                + "TpAmb=2\n"
                + "VerAplic=SP_NFE_PL_005c\n"
                + "CStat=107\n"
                + "XMotivo=Serviço em Operação\n"
                + "CUF=35\n"
                + "DhRecbto=2009-03-25T08:44:20\n"
                + "TMed=1\n"
                + "DhRetorno=\n"
                + "DigVal=a8F/F3ibhYYXI5GLhCM82O8yiqc=\n"
                + "XObs=";
        System.out.println(lerTagIni("VeRsAo", ini));
        System.out.println(lerTagIni("tpamb", ini));
        System.out.println(lerTagIni("VERAPLIC", ini));
        System.out.println(lerTagIni("DHRECBto", ini));
//        System.out.println(lerTagIni("xmOTIVO", ini));
        System.out.println(lerTagIni("xmOTIVO", ini, "edson"));
        System.out.println(lerTagIni("xmOTIVO", ini, "moretti"));
        System.out.println(lerTagIni("xmOTIVO", ini, "status"));
        System.out.println(lerTagIni("xmOTIVO", ini));
        System.out.println(lerTagIni("DigVal", ini));
    }
}
