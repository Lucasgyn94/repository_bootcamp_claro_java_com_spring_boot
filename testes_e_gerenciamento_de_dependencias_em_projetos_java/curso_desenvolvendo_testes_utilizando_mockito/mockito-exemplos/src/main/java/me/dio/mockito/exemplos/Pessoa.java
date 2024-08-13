package me.dio.mockito.exemplos;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String documento;
    private LocalDate nascimento;
    private DadosLocalizacao endereco;

    public Pessoa(String nome, String documento, LocalDate nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    public void adicionaDadosEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setEndereco(DadosLocalizacao endereco) {
        this.endereco = endereco;
    }

}
