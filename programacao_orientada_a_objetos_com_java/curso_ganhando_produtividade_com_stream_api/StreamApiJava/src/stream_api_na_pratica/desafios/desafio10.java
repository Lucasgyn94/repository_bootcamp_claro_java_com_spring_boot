package stream_api_na_pratica.desafios;

/*
* Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
* */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class desafio10 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);

        Map<String, List<Integer>> mutiplosDe3e5 = listaDeNumeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.groupingBy(n -> {
                    if (n % 3 ==0) {
                        return "Multiplo de 3";
                    } else {
                        return "Multiplo de 5";
                    }
                }));
        mutiplosDe3e5.forEach((chave, valor) -> System.out.println(chave + ": " + valor));
    }
}
