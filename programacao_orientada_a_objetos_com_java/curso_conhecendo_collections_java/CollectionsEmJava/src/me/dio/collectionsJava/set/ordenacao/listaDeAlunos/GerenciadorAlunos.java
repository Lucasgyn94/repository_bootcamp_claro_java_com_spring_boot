package me.dio.collectionsJava.set.ordenacao.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        this.alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;

        for (Aluno aluno : this.alunosSet) {
            if (aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
            }
        }
        this.alunosSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPersonalizadoPorNota());
        alunosPorNota.addAll(this.alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(this.alunosSet);
    }
}
