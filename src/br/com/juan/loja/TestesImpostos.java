package br.com.juan.loja;

import br.com.juan.loja.imposto.CalculadoraDeImpostos;
import br.com.juan.loja.imposto.ISS;
import br.com.juan.loja.imposto.Imposto;
import br.com.juan.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
