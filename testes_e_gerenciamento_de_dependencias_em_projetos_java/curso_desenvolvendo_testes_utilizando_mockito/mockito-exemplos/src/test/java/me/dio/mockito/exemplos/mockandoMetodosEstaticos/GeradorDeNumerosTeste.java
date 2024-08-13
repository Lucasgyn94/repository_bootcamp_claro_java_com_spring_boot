package me.dio.mockito.exemplos.mockandoMetodosEstaticos;

import me.dio.mockito.exemplos.GeradorDeNumeros;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {

    @Test
    void testaGeracaoComTamanhoDefinido() {
        MockedStatic<GeradorDeNumeros> mockedStatic = Mockito.mockStatic(GeradorDeNumeros.class);

        List<Integer> inteiros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //List<String> inteirosString = Arrays.asList("1","2", "3");

        mockedStatic.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt()))
                .thenReturn(inteiros);

        Assertions.assertEquals(inteiros, GeradorDeNumeros.geraNumerosAleatorios(9));
    }
}
