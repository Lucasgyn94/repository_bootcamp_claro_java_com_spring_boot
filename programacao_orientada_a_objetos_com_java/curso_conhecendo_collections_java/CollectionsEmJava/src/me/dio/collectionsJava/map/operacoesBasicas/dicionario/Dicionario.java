package me.dio.collectionsJava.map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra) {
        if (!this.dicionarioMap.isEmpty()) {
            if (this.dicionarioMap.containsKey(palavra)) {
                this.dicionarioMap.remove(palavra);
            }
        }
    }

    public void exibirPalavras() {
        System.out.println(this.dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraEncontrada = null;

        if (!this.dicionarioMap.isEmpty()) {
            if (this.dicionarioMap.containsKey(palavra)) {
                palavraEncontrada = this.dicionarioMap.get(palavra);
            } else {
                return "Palavra nao encontrada";
            }
        }
        return palavraEncontrada;
    }

    public String pesquisarPorPalavraModoFor(String palavra) {
        String palavraEncontrada = null;

        if (!this.dicionarioMap.isEmpty()) {
            for (String p : this.dicionarioMap.values()) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraEncontrada = p;
                }
            }
        }
        return palavraEncontrada;
    }

}
