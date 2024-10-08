package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
* */
public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);

        List<Integer> numerosFiltrados = listaDeNumeros.stream()
                .filter(n -> n >= 5 && n <= 10)
                .collect(Collectors.toList());

        System.out.println("NUMEROS FILTRADOS: ");
        for (Integer n : numerosFiltrados) {
            System.out.print(n + " ");
        }
    }
}
