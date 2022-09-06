package br.com.juan.loja;

import br.com.juan.loja.desconto.CalculadoraDeDescontos;
import br.com.juan.loja.imposto.CalculadoraDeImpostos;
import br.com.juan.loja.imposto.ISS;
import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"),7);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"),3);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
