package me.dio.mockito.exemplos.capturandoArgumentos;

import me.dio.mockito.exemplos.Email;
import me.dio.mockito.exemplos.Formato;
import me.dio.mockito.exemplos.PlataformaDeEnvio;
import me.dio.mockito.exemplos.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaAPlataforma() {
        String enderecoDeEmail = "usuario@test.co.br";
        String mensagem = "Ola mundo teste mensagem";
        boolean ehFormatoHtml = true;

        servicoEnvioEmail.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.HTML, emailCapturado.getFormato());
    }
}
