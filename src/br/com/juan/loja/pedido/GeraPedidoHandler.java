package br.com.juan.loja.pedido;

import br.com.juan.loja.orcamento.Orcamento;
import br.com.juan.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.juan.loja.pedido.acao.EnviaEmailPedido;
import br.com.juan.loja.pedido.acao.SalvarPedidoNoBandoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
