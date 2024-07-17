package switch_case;

import java.util.Scanner;

public class SistemaDeMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma mediga para conversao entre P, M e G: ");
        String medidaUsuario = scanner.nextLine().toUpperCase();
        char primeiraLetra = medidaUsuario.charAt(0);

        switch (primeiraLetra) {
            case 'P':
                System.out.println("Tamanho " + primeiraLetra + " digitado pelo usuario corresponde ao tamanho: PEQUENO");
                break;
            case 'M':
                System.out.println("Tamanho " + primeiraLetra + " digitado pelo usuario corresponde ao tamanho: MEDIO");

                break;
            case 'G':
                System.out.println("Tamanho " + primeiraLetra + " digitado pelo usuario corresponde ao tamanho: GRANDE");
                break;
            default:
                System.out.println("Digite uma das opçoes acima: ");
        }


    }
}
