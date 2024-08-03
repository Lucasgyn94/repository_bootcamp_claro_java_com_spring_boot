package me.dio.collectionsJava.list.operacoesBasicas.listaDeTarefas;

public class MainListaTarefas {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        System.out.println("Numero total de elementos na lista: " + lista.obterNumeroTotalTarefas());

        System.out.println("Adicionando primeira tarefa: ");
        lista.adicionarTarefa("Primeira tarefa");

        System.out.println("Adicionando segunda tarefa: ");
        lista.adicionarTarefa("Segunda tarefa");
        lista.adicionarTarefa("Segunda tarefa");
        lista.obterDescricoesTarefas();

        System.out.println("Numero total de elementos na lista: " + lista.obterNumeroTotalTarefas());

        System.out.println("Qual elemento da lista deseja remover?");
        lista.removerTarefa("Segunda tarefa");

        System.out.println("Numero total de elementos na lista: " + lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();


    }
}
