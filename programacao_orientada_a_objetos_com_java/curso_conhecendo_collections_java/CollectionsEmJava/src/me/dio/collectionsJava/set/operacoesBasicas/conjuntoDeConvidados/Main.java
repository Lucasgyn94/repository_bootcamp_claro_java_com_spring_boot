package me.dio.collectionsJava.set.operacoesBasicas.conjuntoDeConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Lista antes da adiçao de convidados: ");
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " pessoas atualmente dentro do set de convidados!");

        conjuntoConvidados.adicionarConvidado("Nome 1", 1234);
        conjuntoConvidados.adicionarConvidado("Nome 2", 1235);
        conjuntoConvidados.adicionarConvidado("Nome 3", 1235);
        conjuntoConvidados.adicionarConvidado("Nome 4", 1236);

        System.out.println("\nLista apos adiçao de convidados: ");
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " pessoas atualmente dentro do set de convidados!");


        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("\nLista apos remoçao convidado por codigo de convite: ");
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " pessoas atualmente dentro do set de convidados!");

    }
}
