package me.dio.collectionsJava.map.ordenacao.agendaDeEventos;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 7), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 23), "Evento 4", "Atracao 4");


        agendaEventos.exibirEvento();
        agendaEventos.exibirProximoEvento();
    }
}
