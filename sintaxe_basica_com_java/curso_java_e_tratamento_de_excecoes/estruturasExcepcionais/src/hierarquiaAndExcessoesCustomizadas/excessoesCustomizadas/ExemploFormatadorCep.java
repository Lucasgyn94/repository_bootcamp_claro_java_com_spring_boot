package hierarquiaAndExcessoesCustomizadas.excessoesCustomizadas;

public class ExemploFormatadorCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("74590711");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde ao formato esperado (xxxxxxxx)");
        }

    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "74.590-711";
    }
}
