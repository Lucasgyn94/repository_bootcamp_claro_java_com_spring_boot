package me.dio.collectionsJava.list.ordenacao.ordenacaoDeNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.58);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 18, 1.58);

        System.out.println("\nLista por ordem de inserçao: ");
        System.out.println(ordenacaoPessoa.getListaDePessoas());

        System.out.println("\nOrdenando por idade: ");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("\nOrdenando por altura: ");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
