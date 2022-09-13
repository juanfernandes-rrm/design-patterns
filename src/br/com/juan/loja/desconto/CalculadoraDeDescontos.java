package br.com.juan.loja.desconto;

import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisDeCincoItens(
                new DescontoMaiorQueQuinhentos(
                    new SemDesconto()
                )
        );
        return desconto.calcular(orcamento);
    }
}
