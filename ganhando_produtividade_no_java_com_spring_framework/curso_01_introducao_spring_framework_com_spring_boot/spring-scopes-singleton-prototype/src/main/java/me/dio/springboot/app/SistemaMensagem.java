package me.dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente teachTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        teachTeam.setEmail("tech@dio.com.br");
        System.out.println(teachTeam);
        System.out.println("Bem vindo a elite tech");
    }

}
