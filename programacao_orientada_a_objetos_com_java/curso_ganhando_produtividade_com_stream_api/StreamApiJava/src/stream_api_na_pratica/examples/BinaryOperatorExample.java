package stream_api_na_pratica.examples;

/*
* Representa uma operacap que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T
* E usada para realizar operaçoes de reduçao em pares de elementos, como somar numeros ou combinar objetos
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        // criando lista de numeros inteiros
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // usando o BinaryOperator com expressao lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (numero1, numero2) -> numero1 + numero2;

        // usando o BinaryOperator para somar todos os numeros no Stream
        int resultado = listaDeNumeros.stream()
                .reduce(0, Integer::sum);


        /*
        int resultado = listaDeNumeros.stream()
                .reduce(0, somar);
        */
        // imprimindo o resultado da soma
        System.out.println("A soma dos numeros e : " + resultado);
    }
}
