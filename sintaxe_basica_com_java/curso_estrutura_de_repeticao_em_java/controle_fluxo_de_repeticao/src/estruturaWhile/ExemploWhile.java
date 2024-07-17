package estruturaWhile;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double mesada = 50.00;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce no valor de " + valorDoce + " adicionado com sucesso!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces!");
        scanner.close();
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
