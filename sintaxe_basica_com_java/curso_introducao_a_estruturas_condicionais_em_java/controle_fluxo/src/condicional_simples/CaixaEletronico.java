package condicional_simples;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double SALDO = 1500.0;
        Double valorSaque = 0.0;

        System.out.println("*** CAIXA ELETRONICO ***");
        System.out.println("Saldo Atual: " + SALDO);
        System.out.println("Digite o valor para saque: ");
        valorSaque = scanner.nextDouble();

        if (valorSaque <= SALDO) {
            SALDO -= valorSaque;
            System.out.println("Saque no valor de: R$" + valorSaque + " efetuado com sucesso!");
            System.out.println("Novo saldo: " + SALDO);
        }
        System.out.println("Novo saldo: " + SALDO);


    }
}
