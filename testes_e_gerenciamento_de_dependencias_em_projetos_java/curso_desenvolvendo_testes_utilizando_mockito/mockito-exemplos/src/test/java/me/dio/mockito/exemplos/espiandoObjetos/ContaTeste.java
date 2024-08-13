package me.dio.mockito.exemplos.espiandoObjetos;

import me.dio.mockito.exemplos.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarORdemDeChamadas() {
        conta.pagaBoleto(300);
        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeDeChamadas() {
        conta.validaSaldo(300);
        conta.validaSaldo(300);
        conta.validaSaldo(300);
        //conta.validaSaldo(300);


        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }
}
