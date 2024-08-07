package me.dio.collectionsJava.map.pesquisa.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavrasMap.isEmpty()) {
            this.palavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        for (Map.Entry<String, Integer> entrada : this.palavrasMap.entrySet()) {
            System.out.println("Palavra: " + entrada.getKey() + " - " + "Contagem: " + entrada.getValue());
        }
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        Map<String, Integer> frequenciaEContagemPalavras = new HashMap<>();

        for (Map.Entry<String, Integer> entrada : this.palavrasMap.entrySet()) {
            if (entrada.getValue() > maiorContagem) {
                maiorContagem = entrada.getValue();
                palavraMaisFrequente = entrada.getKey();
            }
        }
        frequenciaEContagemPalavras.put(palavraMaisFrequente, maiorContagem);
        return frequenciaEContagemPalavras;
    }


}

















 /*
     public String encontrarPalavrasMaisFrequente() {
    String linguagemMaisFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        linguagemMaisFrequente = entry.getKey();
      }
    }
    return linguagemMaisFrequente;
  }
     */
