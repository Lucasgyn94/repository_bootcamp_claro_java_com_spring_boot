package me.dio.collectionsJava.introducao.genericsTypes;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {

    public static void main(String[] args) {
        // exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);

        // exemplo com generics
        Set<String> conjuntoComGenerics = new HashSet<>();
        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");
        // conjuntoComGenerics.add(10);

        // iterando sobre o conjunto com generics
        System.out.println("ITERANDO SOBRE CONJUNTO COM GENERICS");
        for (String el : conjuntoComGenerics) {
            System.out.println(el);
        }
        // iterando sobre o conjunto sem generics
        System.out.println("\nITERANDO SOBRE CONJUNTO SEN GENERICS");
        for (Object el : conjuntoSemGenerics) {
            System.out.println(el);
        }

    }
}
