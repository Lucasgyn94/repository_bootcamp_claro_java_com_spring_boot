package stream_api_na_pratica.examples;

/*
 * Representa uma operaçao que nao aceita nenhum argumento e retorna um resultado do tipo T
 * E comumente usada para criar ou forecer novos objetos de um determinado tipo
 * */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        // usar o Supplier com expressao lambda para fornecer uma saudaçao personalizada
        Supplier<String> saudacao = () -> "Ola, seja bem-vindo(a)!";

        // usando Supplier para obter uma lista com 5 saudaçoes
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        // imprimindo as saudaçoes geradas
        listaSaudacoes.forEach(s -> System.out.println(s));
    }
}
