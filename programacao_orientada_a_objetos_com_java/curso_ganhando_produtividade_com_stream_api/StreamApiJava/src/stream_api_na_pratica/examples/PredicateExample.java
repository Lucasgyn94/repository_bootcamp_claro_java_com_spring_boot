package stream_api_na_pratica.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
* Representa uma funçao que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso)
* E comumente usada para filtrar os elementos do Stream com base em alguma condiçao
*
* */
public class PredicateExample {

    public static void main(String[] args) {
        // criando lista de palavras
        List<String> listaDePalavras = Arrays.asList("Java", "Python", "Kotlin", "JavaScript", "C", "go", "ruby", "C#");

        // criando Predicate que verifica se a palvra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        listaDePalavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println
                );

        /*
        listaDePalavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println
                );

         */

    }
}
