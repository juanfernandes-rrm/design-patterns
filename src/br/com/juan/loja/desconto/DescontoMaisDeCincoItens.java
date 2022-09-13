package br.com.juan.loja.desconto;

import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto{
    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal(0.1));
        }
        return proximo.calcular(orcamento);
    }
}
