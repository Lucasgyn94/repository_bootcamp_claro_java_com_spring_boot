package models;

public class Conta {
    private Integer numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private Double saldo;

    public Conta() {
        // metodo construtor vazio
    }

    public Conta(String nomeCliente, String numeroAgencia, Integer numeroConta , Double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // getters
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    // setters

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}
