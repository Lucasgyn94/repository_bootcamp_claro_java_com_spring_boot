package switch_case;
import java.util.Scanner;

public class SistemaPlanoTelefonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** TABELA DE PLANOS ***");
        System.out.println("BASIC: 100 minutos de ligaçao");
        System.out.println("MIDIA: 100 minutos de ligaçao + Whatsapp e Instagram Gratis");
        System.out.println("TURBO: 100 minutos de ligaçao + Whatsapp e Instagram Gratis + 5Gb Youtube");
        System.out.println("Digite uma opçao de plano: ");
        String opcaoPlanoUsuario = scanner.nextLine().toUpperCase();

        switch (opcaoPlanoUsuario) {
            case "BASIC":
                System.out.println("Plano " + opcaoPlanoUsuario + " selecionado com sucesso!");
                break;
            case "MIDIA":
                System.out.println("Plano " + opcaoPlanoUsuario + " selecionado com sucesso!");
                break;
            case "TURBO":
                System.out.println("Plano " + opcaoPlanoUsuario + " selecionado com sucesso!");
                break;
            default:
                System.out.println("Digite uma das opçoes acima: ");
                break;
        }
    }
}
