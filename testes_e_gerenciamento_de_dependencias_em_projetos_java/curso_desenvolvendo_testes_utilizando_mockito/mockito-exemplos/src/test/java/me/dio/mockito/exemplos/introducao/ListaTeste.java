package me.dio.mockito.exemplos.introducao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> listaDeletras;

    @Test
    public void adicionarLetrasNaLista() {
        Mockito.when(listaDeletras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", listaDeletras.get(0));
    }
}
