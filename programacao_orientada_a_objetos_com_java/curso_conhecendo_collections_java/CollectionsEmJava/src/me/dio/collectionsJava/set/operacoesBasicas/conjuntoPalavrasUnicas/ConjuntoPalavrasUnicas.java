package me.dio.collectionsJava.set.operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicasSet = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
//        String palavraParaRemover = null;
//
//        for (String p : this.palavrasUnicasSet) {
//            if (p.equalsIgnoreCase(palavra)) {
//                palavraParaRemover = p;
//                break;
//            }
//        }
//        this.palavrasUnicasSet.remove(palavraParaRemover);
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra nao encontrada");
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
//        boolean palavraNoConjunto = false;
//
//        for (String p : this.palavrasUnicasSet) {
//            if (this.palavrasUnicasSet.contains(palavra)) {
//                palavraNoConjunto = true;
//                break;
//            }
//        }
//        return palavraNoConjunto;
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(this.palavrasUnicasSet);
    }
}
