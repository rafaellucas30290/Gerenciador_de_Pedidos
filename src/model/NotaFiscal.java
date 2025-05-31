package model;

import java.time.LocalDateTime;
import java.util.List;

public class NotaFiscal {
    private String nomeCliente;
    private List<Produto> produtos;
    private double total;
    private LocalDateTime dataHora;

    public NotaFiscal(String nomeCliente, List<Produto> produtos, double total) {
        this.nomeCliente = nomeCliente;
        this.produtos = produtos;
        this.total = total;
        this.dataHora = LocalDateTime.now();
    }

    public void imprimir() {
        System.out.println("===== NOTA FISCAL =====");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Data: " + dataHora.toLocalDate());
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + " R$ " + p.getPreco());
        }
        System.out.println("Total: R$ " + total);
        System.out.println("=======================");
    }
}
