package views;

import java.util.Scanner;

public class ContaView {
    private Scanner scanner = new Scanner(System.in);

    public String pegarNumeroAgenciaDoCliente() {
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        return agencia;
    }

    public Integer pegarNumeroContaDoCliente() {
        System.out.println("Por favor, digite o número da Conta:");
        Integer numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente
        return numero;
    }

    public String pegarNomeDoCliente() {
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        return nomeCliente;
    }

    public Double pegarSaldoDoCliente() {
        System.out.println("Por favor, digite o Saldo:");
        Double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha pendente
        return saldo;
    }
}
