package me.dio.collectionsJava.set.operacoesBasicas.conjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        System.out.println("LISTA DE PALAVRAS ANTES DA ADIÇAO: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("palavra 3");

        System.out.println("\nLISTA DE PALAVRAS APOS A ADIÇAO: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("palavra 3");
        System.out.println("\nLISTA DE PALAVRAS APOS A REMOÇAO: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nPALAVRA EXISTE NO CONJUNTO?: ");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("palavra 13"));





    }
}
