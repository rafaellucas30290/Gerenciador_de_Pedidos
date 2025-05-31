package service;

import enums.TipoPagamento;
import model.NotaFiscal;
import model.Pedido;
import pagamento.Pagamento;
import pagamento.PagamentoFactory;

public class PedidoService {
    public void finalizarPedido(Pedido pedido, TipoPagamento tipoPagamento) {
        double total = calcularValorTotal(pedido);
        Pagamento pagamento = PagamentoFactory.criarPagamento(tipoPagamento);
        pagamento.processarPagamento(total);
        pedido.setTotal(total);
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente().getNome(),
                pedido.getProdutos(),
                total
        );
        notaFiscal.imprimir();
    }

    private double calcularValorTotal(Pedido pedido) {
        double total = 0;
        if (pedido.getProdutos() != null) {
            for (var p : pedido.getProdutos()) {
                total += p.getPreco();
            }
        }
        return total;
    }
}

