package me.dio.collectionsJava.list.pesquisa.catologoDeLivros;

public class MainCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);

        System.out.println("Livros Cadastrados");
        catalogoLivros.exibirCatalogoLivros();

        System.out.println("\nPesquisa por autor: ");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println("\nPesquisa por intervalo de ano: ");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

        System.out.println("\nPesquisa por titulo: ");
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 2"));

    }
}
