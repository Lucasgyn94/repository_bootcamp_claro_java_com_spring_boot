package me.dio.collectionsJava.list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaItensParaRemocao = new ArrayList<>();

        for (Item item : this.listaDeCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaItensParaRemocao.add(item);
            }
        }

        this.listaDeCompras.removeAll(listaItensParaRemocao);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for (Item item : this.listaDeCompras) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println("Exibindo itens do carrinho: ");
        for (Item item : this.listaDeCompras) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }
}
