package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
* */
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);
        //List<Integer> listaDeNumeros = Arrays.asList(2, 2);

        int soma = listaDeNumeros.stream()
                .mapToInt(n -> n * n)
                .sum();

    System.out.println("Soma do quadrado de todos os numeros da lista: " + soma);
    }
}
