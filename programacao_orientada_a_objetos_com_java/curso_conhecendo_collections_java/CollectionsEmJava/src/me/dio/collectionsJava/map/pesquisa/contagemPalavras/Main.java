package me.dio.collectionsJava.map.pesquisa.contagemPalavras;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("palavra 1", 2);
        contagemPalavras.adicionarPalavra("palavra 2", 3);
        contagemPalavras.adicionarPalavra("palavra 2", 44);
        contagemPalavras.adicionarPalavra("palavra 3", 5);
        contagemPalavras.adicionarPalavra("palavra 4", 10);

        System.out.println("PALAVRAS ADICIONADAS: ");
        contagemPalavras.exibirContagemPalavras();

        System.out.println("PALAVRA MAIS FREQUENTE: ");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
