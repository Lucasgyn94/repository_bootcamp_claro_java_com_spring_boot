package me.dio.collectionsJava.map.ordenacao.livrariaOnline;

public class Main {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println("EXIBINDO LIVROS ADICIONADOS: ");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("EXIBINDO APOS REMOCAO DE UM LIVRO: ");
        livrariaOnline.removerLivro("Malorie");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println("LIVRO MAIS BARATO: ");
        System.out.println(livrariaOnline.obterLivroMaisBarato());

        System.out.println("LIVRO MAIS CARO: ");
        System.out.println(livrariaOnline.obterLivroMaisCaro());
    }
}
