package me.dio.collectionsJava.map.ordenacao.livrariaOnline;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        this.livrariaMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> chavesParaRemover = new ArrayList<>();

        if (!this.livrariaMap.isEmpty()) {
            for (Map.Entry<String, Livro> entrada : this.livrariaMap.entrySet()) {
                if (entrada.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chavesParaRemover.add(entrada.getKey());
                }
            }
        }

        for (String chave : chavesParaRemover) {
            this.livrariaMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(this.livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPersonalizadoPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entrada : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entrada.getKey(), entrada.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entrada : this.livrariaMap.entrySet()) {
            Livro livro = entrada.getValue();

            if(livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.put(entrada.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!this.livrariaMap.isEmpty()) {
            for (Livro livro : this.livrariaMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        }

        for (Map.Entry<String, Livro> entrada : this.livrariaMap.entrySet()) {
            if (entrada.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = this.livrariaMap.get(entrada.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }

        return livrosMaisCaros;
    }
    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!this.livrariaMap.isEmpty()) {
            for (Livro livro : this.livrariaMap.values()){
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        }

        for (Map.Entry<String, Livro> entrada : this.livrariaMap.entrySet()) {
            if (entrada.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = this.livrariaMap.get(entrada.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }

        return livrosMaisBaratos;
    }

}

