package me.dio.collectionsJava.introducao.genericsTypes;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {

    public static void main(String[] args) {
        // exemplo sem generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        // exemplo com generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        // iterando sobre a lista com generics
        System.out.println("ITERANDO SOBRE A LISTA COM GENERICS");
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        // iterando sobre a lista sem generics
        System.out.println("\nITERANDO SOBRE A LISTA SEM GENERICS");
        for (Object el : listaSemGenerics) {
            System.out.println(el);
        }
    }
}
