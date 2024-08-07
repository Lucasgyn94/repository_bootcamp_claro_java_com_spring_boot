package me.dio.collectionsJava.map.pesquisa.estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;

        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto produto : this.estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto produto : this.estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto produto : this.estoqueProdutosMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotal = null;
        double maiorValorTotal = Double.MIN_VALUE;

        if (!this.estoqueProdutosMap.isEmpty()) {
            for (Produto produto : this.estoqueProdutosMap.values()) {
                double valorTotalProduto = produto.getPreco() * produto.getQuantidade();
                if (valorTotalProduto > maiorValorTotal) {
                    produtoMaiorQuantidadeValorTotal = produto;
                    maiorValorTotal = valorTotalProduto;
                }
            }
        }
        return produtoMaiorQuantidadeValorTotal;
    }
}
