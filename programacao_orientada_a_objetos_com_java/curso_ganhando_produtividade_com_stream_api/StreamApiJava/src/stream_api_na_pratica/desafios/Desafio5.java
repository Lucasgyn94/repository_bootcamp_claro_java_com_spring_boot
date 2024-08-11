package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
* Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
* */
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Media de todos os numeros");

        double media = listaDeNumeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(() -> new IllegalStateException("Nao ha numeros maiores que 5"));

        System.out.println("Media dos numeros maiores que 5: ");
        System.out.println(media);
    }
}
