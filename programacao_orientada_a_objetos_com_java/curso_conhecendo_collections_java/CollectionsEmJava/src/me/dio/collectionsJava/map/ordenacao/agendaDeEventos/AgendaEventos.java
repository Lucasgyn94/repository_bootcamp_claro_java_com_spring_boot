package me.dio.collectionsJava.map.ordenacao.agendaDeEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        Evento evento = new Evento(nomeEvento, nomeAtracao);
        this.eventosMap.put(data, evento);
    }

    public void exibirEvento() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void exibirProximoEvento() {
        //Set<LocalDate> dataSet = this.eventosMap.keySet(); // retorna todas as chaves
        //Collection<Evento> values = this.eventosMap.values(); // retorna todos valores
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O Proximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
                break;
            }
        }

    }
}
