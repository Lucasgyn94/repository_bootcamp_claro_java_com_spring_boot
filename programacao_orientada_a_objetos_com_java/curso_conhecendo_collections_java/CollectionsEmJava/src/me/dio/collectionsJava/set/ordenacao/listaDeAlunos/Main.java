package me.dio.collectionsJava.set.ordenacao.listaDeAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Lucas", 1234L, 10d);
        gerenciadorAlunos.adicionarAluno("Ana", 1246L, 7d);
        gerenciadorAlunos.adicionarAluno("Ana", 1246L, 6d);
        gerenciadorAlunos.adicionarAluno("Tampinha", 1298L, 9d);
        gerenciadorAlunos.adicionarAluno("Carolina", 1252L, 8d);

        System.out.println("LISTA DE ALUNOS CADASTRADOS: ");
        gerenciadorAlunos.exibirAlunos();

        System.out.println("EXIBIR ALUNO POR ORDEM ALFABETICA NOME");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("EXIBIR ALUNO POR ORDEM CRESCENTE NOTA: ");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        System.out.println("LISTA APOS REMOCAO DE UM ALUNO");
        gerenciadorAlunos.removerAluno(1246L);
        gerenciadorAlunos.exibirAlunos();
    }
}
