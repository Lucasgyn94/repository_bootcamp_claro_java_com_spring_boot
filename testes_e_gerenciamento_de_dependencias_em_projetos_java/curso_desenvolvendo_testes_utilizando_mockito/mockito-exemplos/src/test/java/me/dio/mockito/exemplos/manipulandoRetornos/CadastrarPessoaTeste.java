package me.dio.mockito.exemplos.manipulandoRetornos;

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

import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void cadastrarPessoa() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("go", "goiania", "rua 2", "150", "balneario");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);
        Pessoa p1 = cadastrarPessoa.cadastrarPessoa("lucas", "12345", LocalDate.of(1994,8,5), "74590711");

        DadosLocalizacao enderecoLucas = p1.getEndereco();
        Assertions.assertEquals(dadosLocalizacao.getBairro(), enderecoLucas.getBairro());
        Assertions.assertEquals(dadosLocalizacao.getCidade(), enderecoLucas.getCidade());
        Assertions.assertEquals(dadosLocalizacao.getUf(), enderecoLucas.getUf());

    }

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios() {
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);

        Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("lucas", "12345", LocalDate.of(1994,8,5), "74590711"));
    }
}
