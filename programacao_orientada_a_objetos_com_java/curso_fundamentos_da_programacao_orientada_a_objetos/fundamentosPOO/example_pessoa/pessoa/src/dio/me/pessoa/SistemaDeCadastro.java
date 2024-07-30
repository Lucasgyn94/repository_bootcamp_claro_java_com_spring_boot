package dio.me.pessoa;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa("Lucas", "00916047236");
        lucas.setEndereco("Avenida Contorno, 150");

        System.out.println(lucas);
    }
}
