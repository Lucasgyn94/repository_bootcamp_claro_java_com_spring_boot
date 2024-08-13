package me.dio.mockito.exemplos.mockandoObjetos;

import me.dio.mockito.exemplos.ApiDosCorreios;
import me.dio.mockito.exemplos.CadastrarPessoa;
import me.dio.mockito.exemplos.DadosLocalizacao;
import me.dio.mockito.exemplos.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    public void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("go", "goiania", "rua 2", "150", "balneario");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("74590711")).thenReturn(dadosLocalizacao);
        Pessoa p1 = cadastrarPessoa.cadastrarPessoa("lucas", "12345", LocalDate.now(), "74590711");

        Assertions.assertEquals("lucas", p1.getNome());
        Assertions.assertEquals("12345", p1.getDocumento());
        Assertions.assertEquals("go", p1.getEndereco().getUf());
        Assertions.assertEquals("goiania", p1.getEndereco().getCidade());
    }

}
