package builder;

import model.Cliente;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder{

    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public PedidoBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }
    public PedidoBuilder adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        return this;

    }
    public Pedido Build() {
        return new Pedido(this.cliente, this.produtos);
    }

}
