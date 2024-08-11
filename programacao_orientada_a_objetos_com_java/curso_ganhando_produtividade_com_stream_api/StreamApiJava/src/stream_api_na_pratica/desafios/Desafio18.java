package stream_api_na_pratica.desafios;

import java.util.Arrays;
import java.util.List;

/*
* ## Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
* */
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 1, 1);

        boolean numerosIguais = listaDeNumeros.stream()
                .allMatch(numero -> numero.equals(listaDeNumeros.get(0)));

        if (numerosIguais) {
            System.out.println("Todos os numeros da lista sao iguais");
        } else {
            System.out.println("Nem todos os numeros da lista sao iguais");
        }
    }
}
