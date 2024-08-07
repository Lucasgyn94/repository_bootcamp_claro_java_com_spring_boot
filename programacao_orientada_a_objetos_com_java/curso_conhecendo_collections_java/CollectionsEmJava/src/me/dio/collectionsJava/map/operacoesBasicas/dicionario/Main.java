package me.dio.collectionsJava.map.operacoesBasicas.dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario dicioario = new Dicionario();

        dicioario.adicionarPalavra("palavra 1", "definicao 1");
        dicioario.adicionarPalavra("palavra 2", "definicao 2");
        dicioario.adicionarPalavra("palavra 3", "definicao 3");
        dicioario.adicionarPalavra("palavra 4", "definicao 4");

        System.out.println("EXIBINDO PALAVRAS ADICIONADAS: ");
        dicioario.exibirPalavras();

        System.out.println("\nEXIBINDO DEFINIÇAO DA PALAVRA ENCONTRADA: ");
        System.out.println(dicioario.pesquisarPorPalavra("palavra 3"));

        System.out.println("\nEXIBINDO DEFINIÇAO DA PALAVRA ENCONTRADA MODO FOR: ");
        System.out.println(dicioario.pesquisarPorPalavra("palavra 1"));

        System.out.println("\nREMOVER PALAVRA: ");
        dicioario.removerPalavra("palavra 2");
        dicioario.exibirPalavras();

    }
}
