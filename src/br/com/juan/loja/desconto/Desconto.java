package br.com.juan.loja.desconto;

import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    //Pq um método concreto?
    //Para o processo de calcular não seja repetido nas classes filhas
    //deve aplicar o desconto? Se sim, então calcula. Se não, chama o próximo desconto
    //Esse processo serve para todas as classes filhas
    //Essas perguntas são respondidas pelas classes filhas
    // e como fazer o calculo
    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
