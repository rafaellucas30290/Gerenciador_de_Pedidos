import builder.PedidoBuilder;
//import enums.TipoPagamento;
import enums.TipoPagamento;
import model.Cliente;
import model.Pedido;

import model.Produto;

import repository.ProdutosRepository;
import service.PedidoService;
//import service.PedidoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Algum Nome");
        List<Produto> produtosDisponiveis = ProdutosRepository.getProdutos();


        Produto produto1 = produtosDisponiveis.get(0);
        Produto produto2 = produtosDisponiveis.get(1);


        Pedido pedido1 = new PedidoBuilder()
                .setCliente(cliente)
                .adicionarProduto(produto1)
                .adicionarProduto(produto2)
                .Build();

        PedidoService pedidoService = new PedidoService();
        pedidoService.finalizarPedido(pedido1, TipoPagamento.PIX);
    }

}