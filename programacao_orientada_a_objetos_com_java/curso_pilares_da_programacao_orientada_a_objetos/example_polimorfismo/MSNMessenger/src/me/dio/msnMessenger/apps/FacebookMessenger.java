package me.dio.msnMessenger.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Facebook Messenger Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook Messenger Recebendo mensagem");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Facebook salvando mensagem!");
    }

}
