package me.dio.mockito.exemplos;

public class ServicoEnvioEmail {
    private PlataformaDeEnvio plataforma;

    public void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHTML) {
        Email email = null;

        if (formatoHTML) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        } else {
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }

        this.plataforma.enviaEmail(email);
    }
}
