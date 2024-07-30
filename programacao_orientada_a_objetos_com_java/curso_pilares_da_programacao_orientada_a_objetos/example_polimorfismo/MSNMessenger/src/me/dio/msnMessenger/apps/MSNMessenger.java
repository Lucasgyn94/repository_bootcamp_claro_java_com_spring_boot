package me.dio.msnMessenger.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("MSN Messenger Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("MSN Messenger Recebendo mensagem");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando historico mensagem MSN");
    }
}