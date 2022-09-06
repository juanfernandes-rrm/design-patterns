package br.com.juan.loja.imposto;

import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
