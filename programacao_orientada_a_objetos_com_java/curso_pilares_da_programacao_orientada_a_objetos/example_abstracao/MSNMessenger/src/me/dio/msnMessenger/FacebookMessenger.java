package me.dio.msnMessenger;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Facebook Messenger Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook Messenger Recebendo mensagem");
    }
}
