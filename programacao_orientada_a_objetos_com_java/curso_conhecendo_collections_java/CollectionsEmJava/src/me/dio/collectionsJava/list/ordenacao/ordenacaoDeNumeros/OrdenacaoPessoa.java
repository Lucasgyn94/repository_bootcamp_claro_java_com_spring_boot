package me.dio.collectionsJava.list.ordenacao.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoa() {
        this.listaDePessoas = new ArrayList<>();
    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.listaDePessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.listaDePessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPersonalizadoPorAltura());
        return pessoasPorAltura;

    }
}
