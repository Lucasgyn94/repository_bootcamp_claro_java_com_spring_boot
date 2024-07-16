package controllers;

import models.Conta;
import service.ContaService;
import views.ContaView;

public class ContaController {

    private ContaView contaView;

    private ContaService contaService;

    public ContaController() {
        this.contaView = new ContaView();
        this.contaService = new ContaService();
    }

    public void iniciar() {
        String nomeCliente = contaView.pegarNomeDoCliente();
        String numeroAgencia = contaView.pegarNumeroAgenciaDoCliente();
        Integer numeroConta = contaView.pegarNumeroContaDoCliente();
        Double saldo = contaView.pegarSaldoDoCliente();

        Conta conta = new Conta(nomeCliente, numeroAgencia, numeroConta, saldo);
        contaService.criarConta(conta);

    }
}
