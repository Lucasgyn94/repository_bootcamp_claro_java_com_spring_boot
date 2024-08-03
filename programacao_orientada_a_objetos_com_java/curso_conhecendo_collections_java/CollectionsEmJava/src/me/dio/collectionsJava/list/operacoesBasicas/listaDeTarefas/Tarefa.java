package me.dio.collectionsJava.list.operacoesBasicas.listaDeTarefas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //getters
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
