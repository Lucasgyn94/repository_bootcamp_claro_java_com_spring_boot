package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
* Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
* */

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);
        Optional<Integer> maiorPrimo = listaDeNumeros.stream()
                .filter(Desafio14::ehPrimo)
                .max(Integer::compare);

        if (maiorPrimo.isPresent()) {
            System.out.println("Maior numero primo: " + maiorPrimo.get());
        } else {
            System.out.println("Nao ha numeros primos");
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
