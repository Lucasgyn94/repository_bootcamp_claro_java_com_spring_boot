package me.dio.collectionsJava.introducao.genericsTypes;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
    public static void main(String[] args) {
        // exemplo sem generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1: ", 5);
        mapaSemGenerics.put("Chave 2", "9");

        // exemplo com generics
        Map<String, Integer> mapaComGenerics = new HashMap<>();
        mapaComGenerics.put("Chave 1", 1);
        mapaComGenerics.put("Chave 2", 2);

        // iterando sobre mapa com generics
        System.out.println("ITERANDO SOBRE MAPA COM GENERICS: ");
        for (Map.Entry<String, Integer> entrada : mapaComGenerics.entrySet()) {
            String chave = entrada.getKey();
            int valor = entrada.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
        // iterando sobre mapa com generics
        System.out.println("ITERANDO SOBRE MAPA SEM GENERICS: ");
        for (Object objeto : mapaSemGenerics.entrySet()) {
            Map.Entry entrada = (Map.Entry) objeto;
            String chave = (String) entrada.getKey();
            Object valor = entrada.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
    }
}
