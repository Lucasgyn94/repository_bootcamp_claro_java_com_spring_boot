package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;

/*
* Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
* */
public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3);

        boolean todosNumerosDistintos = listaDeNumeros.stream()
                .distinct()
                .count() == listaDeNumeros.size();

        if (todosNumerosDistintos) {
            System.out.println("TODOS OS NUMEROS SAO DISTINTOS");
        } else {
            System.out.println("EXISTEM NUMEROS REPETIDOS");
        }
    }
}
