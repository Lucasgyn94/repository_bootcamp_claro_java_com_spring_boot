package condicional_encadeada;

import java.util.Scanner;

public class ResultadoEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0.0;

        System.out.println("*** Resultado Escolar ***");
        System.out.println("Digite a sua nota (use vírgula como separador decimal): ");
        String notaUsuario = scanner.nextLine();

        // Substituir vírgulas por pontos
        String notaUsuarioCorrigida = notaUsuario.replace(',', '.');

        // Converter a string corrigida para double
        nota = Double.parseDouble(notaUsuarioCorrigida);

        if (nota >= 7.0) {
            System.out.println("Aluno aprovado com a nota: " + nota);
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println("Aluno em recuperação com a nota: " + nota);
        } else {
            System.out.println("Aluno reprovado com a nota: " + nota);
        }

        scanner.close();
    }
}
