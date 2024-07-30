package me.dio.msnMessenger;

import me.dio.msnMessenger.apps.FacebookMessenger;
import me.dio.msnMessenger.apps.MSNMessenger;
import me.dio.msnMessenger.apps.ServicoMensagemInstantanea;
import me.dio.msnMessenger.apps.Telegram;

public class ComputadorLucas {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
