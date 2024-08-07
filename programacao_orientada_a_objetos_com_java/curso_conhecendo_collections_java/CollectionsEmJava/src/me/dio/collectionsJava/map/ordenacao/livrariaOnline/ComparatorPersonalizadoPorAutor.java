package me.dio.collectionsJava.map.ordenacao.livrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPersonalizadoPorAutor implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getAutor().compareToIgnoreCase(livro2.getValue().getAutor());
    }
}
