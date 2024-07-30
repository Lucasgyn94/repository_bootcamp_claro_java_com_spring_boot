package me.dio.msnMessenger;

public class Telegram extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Telegram Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Telegram Recebendo mensagem");
    }
}
