package br.com.juan.loja.orcamento.situacao;

import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
