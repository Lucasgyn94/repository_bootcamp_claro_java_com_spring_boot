package me.dio.mockito.exemplos;

public class Conta {
    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto(int valorBoleto) {
        validaSaldo(valorBoleto);
        debita(valorBoleto);
        enviaCreditoParaEmissor(valorBoleto);
    }

    public void validaSaldo(int valorPagamento) {
        if (valorPagamento > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }
    public void debita(int valorPagamento) {
        this.saldo = this.saldo - valorPagamento;
    }

    public void enviaCreditoParaEmissor(int valorPagamento) {

    }
}
