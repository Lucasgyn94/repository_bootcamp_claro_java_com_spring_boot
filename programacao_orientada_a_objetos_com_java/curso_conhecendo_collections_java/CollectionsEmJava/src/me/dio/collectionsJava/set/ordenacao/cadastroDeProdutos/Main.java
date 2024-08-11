package me.dio.collectionsJava.set.ordenacao.cadastroDeProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(8L, "Produto 8", 2d, 2);

        System.out.println("LISTA APOS CADASTRO DE PRODUTOS");
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("\nPRODUTOS EM ORDEM ALFABETICA POR NOME");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("\nPRODUTOS EM ORDEM ALFABETICA POR PRECO");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}