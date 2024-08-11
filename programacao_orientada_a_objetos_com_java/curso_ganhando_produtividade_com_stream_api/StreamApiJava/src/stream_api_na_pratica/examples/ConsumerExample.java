package stream_api_na_pratica.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // criando lista de inteiros
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // usando consumer com expressao lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // usando o consumer para imprimir numeros pares no Stream
        /*
        listaNumeros.stream().
                forEach(imprimirNumeroPar);

         */
        listaNumeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
