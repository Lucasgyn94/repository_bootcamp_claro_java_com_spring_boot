package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/*
* Desafio 12 - Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
* */
public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);
        //List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3);

        Optional<Integer> produtoNumeros = listaDeNumeros.stream()
                .reduce((n1, n2) -> n1 * n2);

        if (produtoNumeros.isPresent()) {
            System.out.println("Produto dos numeros: " + produtoNumeros.get());
        } else {
            System.out.println("Lista vazia");
        }
    }
}
