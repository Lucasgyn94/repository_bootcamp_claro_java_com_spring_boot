package condicional_ternaria;

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

        String resultadoNotaFinal = nota >= 7.0 ? "Aluno aprovado! " : nota >= 5.0 && nota <= 7.0 ? "Aluno em recuperaçao" : "Aluno Reprovado!";
        System.out.println(resultadoNotaFinal);

        scanner.close();
    }
}
