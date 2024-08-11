package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/*
* Desafio 2 - Imprima a soma dos números pares da lista:
  Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
* */

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Numeros pares: ");
        listaDeNumeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
