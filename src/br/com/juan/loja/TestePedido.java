package br.com.juan.loja;

import br.com.juan.loja.orcamento.Orcamento;
import br.com.juan.loja.pedido.GeraPedido;
import br.com.juan.loja.pedido.GeraPedidoHandler;
import br.com.juan.loja.pedido.Pedido;
import br.com.juan.loja.pedido.acao.EnviaEmailPedido;
import br.com.juan.loja.pedido.acao.SalvarPedidoNoBandoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Juan";
        BigDecimal valorOrcamento = new BigDecimal("700");
        int quantidadeItens = 5;

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBandoDeDados(), new EnviaEmailPedido())
        );
        handler.execute(gerador);

    }
}
