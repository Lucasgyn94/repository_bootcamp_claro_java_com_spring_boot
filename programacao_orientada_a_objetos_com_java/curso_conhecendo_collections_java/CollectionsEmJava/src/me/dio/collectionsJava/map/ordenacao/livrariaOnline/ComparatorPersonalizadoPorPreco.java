package me.dio.collectionsJava.map.ordenacao.livrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPersonalizadoPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return Double.compare(livro1.getValue().getPreco(), livro2.getValue().getPreco());
    }
}
