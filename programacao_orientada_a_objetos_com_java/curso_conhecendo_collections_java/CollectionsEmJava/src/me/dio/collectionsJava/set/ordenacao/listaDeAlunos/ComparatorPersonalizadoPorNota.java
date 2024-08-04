package me.dio.collectionsJava.set.ordenacao.listaDeAlunos;

import java.util.Comparator;

public class ComparatorPersonalizadoPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getNota(), aluno2.getNota());
    }
}
