
import br.com.edsonmoretti.acbr.monitorplus.comunicador.ACBrBOLETO;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.Aceite;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.CNAB;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.CaracTitulo;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.INDICEACBR;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.LayoutBol;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.OcorrenciaOriginal;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.RespEmis;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.Sacado;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.TipoDeSaida;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.TipoDiasProtesto;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.TipoImpressao;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.TipoPessoa;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.boleto.Titulo;
import br.com.edsonmoretti.acbr.monitorplus.comunicador.exceptions.ACBrBoletoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edson
 */
public class TesteBoleto {

    public static void main(String[] args) {
        ACBrBOLETO boleto = new ACBrBOLETO();
        try {

            boleto.getCendente().setBairro("Indianópolis");
            boleto.getCendente().setCEP("55010-330");
            boleto.getCendente().setCNPJCPF("10.493.367/0001-48");
            boleto.getCendente().setCaracTitulo(CaracTitulo.CobrancaSimples);
            boleto.getCendente().setCidade("CARUARU");
            boleto.getCendente().setCodigoCedente("123456");
            boleto.getCendente().setComplemento("LOJA");
            boleto.getCendente().setLayoutBol(LayoutBol.Padrao);
            boleto.getCendente().setLogradouro("RUA ALFERES JORGE");
            boleto.getCendente().setNome("GERALDO JOAO DA SILVA ME");
            boleto.getCendente().setNumero("176");
            boleto.getCendente().setRespEmis(RespEmis.ClienteEmite);
            boleto.getCendente().setTipoPessoa(TipoPessoa.PessoaJuridica);
            boleto.getCendente().setUF("PE");

            boleto.getConta().setAgencia(2530);
            boleto.getConta().setConta(4472);
            boleto.getConta().setDigitoAgencia(0);
            boleto.getConta().setDigitoConta(4);

            boleto.getBanco().setCnab(CNAB.CNAB400);
            boleto.getBanco().setIndiceacbr(INDICEACBR.Santander);
            boleto.getBanco().setNumero("033");
            //1
            boleto.limparLista();
            //2
            boleto.configurarDados();
            //3
            Sacado sacado = new Sacado();
            sacado.setBairro("Bairro Teste");
            sacado.setCEP("55024-130");
            sacado.setCNPJCPF("074.037.334-01");
            sacado.setCidade("JATAUBA");
            sacado.setComplemento("CASA");
            sacado.setEmail("DANIELDANADO@G3AUTOMACAO.COM.BR");
            sacado.setLogradouro("RUA DO TESTE");
            sacado.setNome("DANIEL NOVAMENTE DA SILVA DE NOVO");
            sacado.setNumero("24");
            sacado.setTipoPessoa(TipoPessoa.PessoaFisica);
            sacado.setUF("PE");

            Titulo titulo = new Titulo();
            titulo.setAceite(Aceite.SIM);
            titulo.setCarteira("123");
            titulo.setDataAbatimento("");
            titulo.setDataDesconto("");
            titulo.setDataDocumento("30/06/2016");
            titulo.setDataMoraJuros("");
            titulo.setDataProcessamento("30/06/2016");
            titulo.setDataProtesto("");
            titulo.setDataProtesto("");
            titulo.setEspecie("DM");
            titulo.setEspecieMod("R$");
            titulo.setInstrucao1("1ª instrução");
            titulo.setInstrucao2("2ª instrução");
            titulo.setLocalPagamento("Pagamento apenas com Daniel");
            titulo.setMensagem("Mensagem");
            titulo.setNossoNumero("000001");
            titulo.setNumeroDocumento("0123456789");
            titulo.setOcorrenciaOriginal(OcorrenciaOriginal.RemessaRegistrar);
            titulo.setParcela("1");
            titulo.setPercentualMulta("0,00");
            titulo.setSeuNumero("0001");
            titulo.setTipoDiasProtesto(TipoDiasProtesto.DiasCorridos);
            titulo.setTipoImpressao(TipoImpressao.Padrão);
            titulo.setTotalParcelas("2");
            titulo.setValorAbatimento("0,00");
            titulo.setValorDesconto("0,00");
            titulo.setValorDocumento("99,00");
            titulo.setValorIOF("0,00");
            titulo.setValorMoraJuros("0,00");
            titulo.setValorOutrasDespesas("0,00");
            titulo.setVencimento("30/07/2016");
            titulo.setSacado(sacado);

            Titulo t = new Titulo();
            t.setAceite(Aceite.SIM);
            t.setCarteira("123");
            t.setDataAbatimento("");
            t.setDataDesconto("");
            t.setDataDocumento("30/06/2016");
            t.setDataMoraJuros("");
            t.setDataProcessamento("30/06/2016");
            t.setDataProtesto("");
            t.setDataProtesto("");
            t.setEspecie("DM");
            t.setEspecieMod("R$");
            t.setInstrucao1("1ª instrução");
            t.setInstrucao2("2ª instrução");
            t.setLocalPagamento("Pagamento apenas com Daniel");
            t.setMensagem("Mensagem");
            t.setNossoNumero("000001");
            t.setNumeroDocumento("0123456789");
            t.setOcorrenciaOriginal(OcorrenciaOriginal.RemessaRegistrar);
            t.setParcela("2");
            t.setPercentualMulta("0,00");
            t.setSeuNumero("0001");
            t.setTipoDiasProtesto(TipoDiasProtesto.DiasCorridos);
            t.setTipoImpressao(TipoImpressao.Padrão);
            t.setTotalParcelas("2");
            t.setValorAbatimento("0,00");
            t.setValorDesconto("0,00");
            t.setValorDocumento("1,00");
            t.setValorIOF("0,00");
            t.setValorMoraJuros("0,00");
            t.setValorOutrasDespesas("0,00");
            t.setVencimento("15/07/2016");
            t.setSacado(sacado);

//            boleto.incluirTitulos(TipoDeSaida.PDF, lista);
            boleto.incluirTitulos(titulo);

            boleto.incluirTitulos(t);

            boleto.imprimir();

        } catch (ACBrBoletoException ex) {
            Logger.getLogger(TesteBoleto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
