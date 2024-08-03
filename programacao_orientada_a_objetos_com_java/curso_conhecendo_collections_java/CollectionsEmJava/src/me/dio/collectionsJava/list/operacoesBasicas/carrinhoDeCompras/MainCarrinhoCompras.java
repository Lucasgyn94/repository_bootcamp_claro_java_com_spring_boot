package me.dio.collectionsJava.list.operacoesBasicas.carrinhoDeCompras;

public class MainCarrinhoCompras {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Notebook", 1000.00, 1);
        carrinho.adicionarItem("Playstation", 1200.00, 1);
        carrinho.adicionarItem("TV", 1100.00, 1);

        carrinho.exibirItens();

        System.out.println("\nValor total do carrinho: ");
        System.out.println(carrinho.calcularValorTotal());
    }
}
