package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosRepository {
    private static List<Produto> produtos = new ArrayList<>();

    static {
        produtos.add(new Produto("Pastel de Frango", 5.00));
        produtos.add(new Produto("Sprite 250ml", 3.00));
        produtos.add(new Produto("Combo sorvete + pastel + refri", 10.00));
        produtos.add(new Produto("Sorvete", 2.50));
    }

    public static List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

}
