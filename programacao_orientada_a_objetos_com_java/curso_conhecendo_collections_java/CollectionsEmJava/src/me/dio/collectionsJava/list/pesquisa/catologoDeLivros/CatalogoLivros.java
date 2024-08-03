package me.dio.collectionsJava.list.pesquisa.catologoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaDeLivros;

    public CatalogoLivros(){
        this.listaDeLivros = new ArrayList<>();
    };

    public void exibirCatalogoLivros() {
        for (Livro livro : this.listaDeLivros) {
            System.out.println("Titulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano: " + livro.getAnoPublicacao());
        }
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!this.listaDeLivros.isEmpty()) {
            for (Livro livro : this.listaDeLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!this.listaDeLivros.isEmpty()) {
            for (Livro livro : this.listaDeLivros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!this.listaDeLivros.isEmpty()) {
            for (Livro livro : this.listaDeLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


}
