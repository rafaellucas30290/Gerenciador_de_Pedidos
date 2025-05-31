package pagamento;

import enums.TipoPagamento;

public class PagamentoFactory {
    public static Pagamento criarPagamento(TipoPagamento tipo) {
        return switch (tipo) {
            case CARTAO -> new PagamentoCartao();
            case PIX -> new PagamentoPix();
            case DINHEIRO -> new PagamentoDinheiro();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido");
        };
    }
}
