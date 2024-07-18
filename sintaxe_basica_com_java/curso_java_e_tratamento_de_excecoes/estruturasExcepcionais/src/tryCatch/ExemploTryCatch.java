package tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

        } catch (InputMismatchException ex) {
            System.out.println("Campos Idade e Altura (0.00) precisar ser numericos ");
        }


    }
}
