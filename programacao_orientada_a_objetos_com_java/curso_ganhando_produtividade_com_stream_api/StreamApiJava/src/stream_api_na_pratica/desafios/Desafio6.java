package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
* Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.


* */
public class Desafio6 {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        boolean temNumeroMaiorQueDez = listaDeNumeros.stream()
                .anyMatch(n -> n > 10);

        if (temNumeroMaiorQueDez) {
            System.out.println("Existe numero maior que 10 na lista");
        } else {
            System.out.println("Nao existe maior que 10 na lista");
        }

    }

}
