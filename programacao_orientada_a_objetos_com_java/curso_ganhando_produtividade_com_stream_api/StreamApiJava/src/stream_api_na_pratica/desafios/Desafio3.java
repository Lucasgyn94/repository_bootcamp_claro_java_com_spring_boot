package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

* */
public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(-1, -2,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("LISTA ORIGINAL: ");
        listaDeNumeros.forEach(n -> System.out.print(n + " "));

        System.out.println("\nLISTA SEM NEGATIVOS: ");
        listaDeNumeros.stream()
                .filter(n -> n > 0)
                .forEach(n -> System.out.print(n + " "));
    }
}
