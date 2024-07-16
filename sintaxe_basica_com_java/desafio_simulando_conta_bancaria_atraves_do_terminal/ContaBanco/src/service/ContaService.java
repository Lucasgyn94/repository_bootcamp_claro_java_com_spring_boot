package service;


import interfaces.IConta;
import models.Conta;

public class ContaService implements IConta {


    @Override
    public void criarConta(Conta conta) {
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco. Sua agência é: " +
                conta.getNumeroAgencia() + ", Conta: " + conta.getNumeroConta() + " e seu de saldo de: R$" + conta.getSaldo() + " já está disponível para saque.");
    }
}

