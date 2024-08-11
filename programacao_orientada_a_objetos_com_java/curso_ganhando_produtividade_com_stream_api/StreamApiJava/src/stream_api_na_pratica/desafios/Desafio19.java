package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* ## Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
* */
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 25, 30, 45);

        int soma = listaNumeros.stream()
                .filter(numero -> numero % 3 == 0)
                .filter(numero -> numero % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma dos numeros divisiveis por 3 e 5: ");
        System.out.println(soma);
    }
}
