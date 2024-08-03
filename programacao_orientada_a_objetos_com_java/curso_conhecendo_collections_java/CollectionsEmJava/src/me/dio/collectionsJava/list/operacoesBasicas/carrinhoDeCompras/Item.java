package me.dio.collectionsJava.list.operacoesBasicas.carrinhoDeCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item() {
        // CONSTRUTOR VAZIO
    }

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
