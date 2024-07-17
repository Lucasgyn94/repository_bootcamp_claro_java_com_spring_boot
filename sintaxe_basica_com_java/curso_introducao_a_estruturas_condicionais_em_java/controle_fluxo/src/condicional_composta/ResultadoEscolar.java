package condicional_composta;

import java.util.Scanner;

public class ResultadoEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0.0;

        System.out.println("*** Resultado Escolar ***");
        System.out.println("Digite a sua nota: ");
        nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aluno aprovado com a nota: " + nota);
        }
        else {
            System.out.println("Aluno reprovado com a nota: " + nota);
        }
    }
}
