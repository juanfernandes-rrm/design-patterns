package br.com.juan.loja;

import br.com.juan.loja.orcamento.Orcamento;
import br.com.juan.loja.pedido.GeraPedido;
import br.com.juan.loja.pedido.GeraPedidoHandler;
import br.com.juan.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
        handler.execute(gerador);

    }
}
