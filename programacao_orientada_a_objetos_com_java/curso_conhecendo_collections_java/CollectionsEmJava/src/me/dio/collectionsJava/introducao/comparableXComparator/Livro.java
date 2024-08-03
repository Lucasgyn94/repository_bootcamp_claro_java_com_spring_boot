package me.dio.collectionsJava.introducao.comparableXComparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    // ordenando livros por ano
    @Override
    public int compareTo(Livro livro) {
        return this.titulo.compareTo(livro.titulo);
    }

    // getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    // setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

// classe para comparar livro por autor
class CompararAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        return livro1.getAutor().compareTo(livro2.getAutor());
    }
}

// classe para comparar livro por ano
class CompararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        if (livro1.getAno() < livro2.getAno()) {
            return -1;
        }
        if (livro1.getAno() > livro2.getAno()) {
            return 1;
        } else {
            return 0;
        }
    }
}

// comparar ano e autor por titulo
class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        int ano = Integer.compare(livro1.getAno(), livro2.getAno());

        if (ano != 0) {
            return ano;
        }

        int autor = livro1.getAutor().compareTo(livro2.getAutor());

        if (autor != 0) {
            return autor;
        }

        return livro1.getTitulo().compareTo(livro2.getTitulo());
    }
}

