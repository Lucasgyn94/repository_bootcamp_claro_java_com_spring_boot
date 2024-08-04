package me.dio.collectionsJava.set.pesquisa.listaDeTarefas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa tarefa : this.tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = tarefa;
            }
        }

        if (tarefaParaRemover != null) {
            this.tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Tarefa nao encontrada");
        }
    }

    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public int contarTarefas() {
        return this.tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa tarefa : this.tarefaSet) {
            if (tarefa.isTarefaConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();

        for (Tarefa tarefa : this.tarefaSet) {
            if (!tarefa.isTarefaConcluida()) {
                tarefasNaoConcluidas.add(tarefa);
            }
        }

        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : this.tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaMarcarPendente = null;

        for (Tarefa tarefa : this.tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcarPendente = tarefa;
                break;
            }
        }

        if (tarefaMarcarPendente != null) {
            if (tarefaMarcarPendente.isTarefaConcluida()) {
                tarefaMarcarPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa nao encontrada");
        }
    }

    public void limparListaTarefa() {
        if (!this.tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("Lista vazia");
        }
    }
}
