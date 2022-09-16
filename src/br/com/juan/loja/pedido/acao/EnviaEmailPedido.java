package br.com.juan.loja.pedido.acao;

import br.com.juan.loja.pedido.Pedido;

public class EnviaEmailPedido implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando e-mail");
    }
}
