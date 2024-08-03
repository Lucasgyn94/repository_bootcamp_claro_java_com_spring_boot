package me.dio.collectionsJava.list.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for (int numero : this.listaDeNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;

        for (int numero : this.listaDeNumeros) {
            if (numero >= maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 999;

        if (!this.listaDeNumeros.isEmpty()) {
            for (int numero : this.listaDeNumeros) {
                if (menorNumero >= numero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return this.listaDeNumeros;
    }
}
