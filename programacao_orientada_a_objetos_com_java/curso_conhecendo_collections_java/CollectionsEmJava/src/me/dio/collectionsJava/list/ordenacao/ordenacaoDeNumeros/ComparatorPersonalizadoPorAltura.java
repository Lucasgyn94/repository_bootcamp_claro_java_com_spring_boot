package me.dio.collectionsJava.list.ordenacao.ordenacaoDeNumeros;

import java.util.Comparator;

public class ComparatorPersonalizadoPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}
