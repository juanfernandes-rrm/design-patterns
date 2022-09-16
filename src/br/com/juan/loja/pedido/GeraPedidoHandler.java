package br.com.juan.loja.pedido;

import br.com.juan.loja.orcamento.Orcamento;
import br.com.juan.loja.pedido.acao.EnviaEmailPedido;
import br.com.juan.loja.pedido.acao.SalvarPedidoNoBandoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //construtor com injeção de dependencias: repository, service
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        System.out.println("Enviando e-mail");
        System.out.println("Salvando pedido");
    }
}
