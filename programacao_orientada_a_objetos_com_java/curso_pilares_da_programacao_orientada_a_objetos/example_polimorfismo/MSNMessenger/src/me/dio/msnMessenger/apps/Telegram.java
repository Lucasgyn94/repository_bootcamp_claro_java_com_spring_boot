package me.dio.msnMessenger.apps;

public class Telegram extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Telegram Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Telegram Recebendo mensagem");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Telegram salvando mensagem!");
    }
}
