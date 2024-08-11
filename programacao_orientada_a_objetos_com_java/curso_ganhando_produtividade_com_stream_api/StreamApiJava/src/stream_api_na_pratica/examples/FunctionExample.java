package stream_api_na_pratica.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar a function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // usar a funçao para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        /*
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                        .toList();
        */

        // imprimir a lista de numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
