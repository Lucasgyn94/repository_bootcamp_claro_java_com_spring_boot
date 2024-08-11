package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/*
* Desafio 16 - Agrupe os números em pares e ímpares:
* Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
*
 */
public class Desafio16 {

    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> numerosPares = listaNumeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> numerosImpares = listaNumeros.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Numeros pares: ");
        System.out.println(numerosPares);

        System.out.println("\nNumeros impares: ");
        System.out.println(numerosImpares);

    }

}
