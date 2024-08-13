package me.dio.mockito.exemplos.espiandoObjetos;

import me.dio.mockito.exemplos.EnviarMensagem;
import me.dio.mockito.exemplos.Mensagem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    public void verificarComportamentoDaClasse() {
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Hello lucas");
        enviarMensagem.adicionarMensagem(mensagem);
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
