package me.dio.msnMessenger;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("MSN Messenger Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("MSN Messenger Recebendo mensagem");
    }
}