package me.dio.collectionsJava.set.pesquisa.listaDeTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("LISTA DE TAREFAS ANTES DA ADIÇAO: ");
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");

        System.out.println("\nLISTA DE TAREFAS APOS A ADIÇAO: ");
        listaTarefas.exibirTarefas();

        System.out.println("\nLISTA DE TAREFAS APOS MARCAR CONCLUIDA");
        listaTarefas.marcarTarefaConcluida("tarefa 1");
        listaTarefas.exibirTarefas();

        System.out.println("\nLISTA DE TAREFAS CONCLUIDAS: ");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("\nLISTA DE TAREFAS PENDENTES: ");
        listaTarefas.obterTarefasPendentes();
        listaTarefas.exibirTarefas();

        System.out.println("\nLISTA DE TAREFAS APOS MARCAR PENDENTE");
        listaTarefas.marcarTarefaPendente("tarefa 1");
        listaTarefas.exibirTarefas();

        System.out.println("\nLISTA DE TAREFAS APOS REMOCAO");
        listaTarefas.removerTarefa("tarefa 1");
        listaTarefas.exibirTarefas();

    }
}
