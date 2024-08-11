package stream_api_na_pratica.desafios;

/*
* Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
* */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);

        boolean numeroNegativo = listaDeNumeros.stream()
                .anyMatch(n -> n < 0);


        if (numeroNegativo) {
            System.out.println("Lista com numero negativo: " + numeroNegativo);
        } else {
            System.out.println("Lista com numero negativo: " + numeroNegativo);
        }
    }
}
