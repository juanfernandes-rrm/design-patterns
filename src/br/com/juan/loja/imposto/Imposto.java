package br.com.juan.loja.imposto;

import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
}
