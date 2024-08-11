package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
* */
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> numerosPrimos = listaNumeros.stream()
                .filter(Desafio17::ehPrimo)
                .collect(Collectors.toList());

        System.out.println("Numeros primos: ");
        System.out.println(numerosPrimos);
    }

    public static boolean ehPrimo(Integer numero) {
        if (numero < 2) {
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
