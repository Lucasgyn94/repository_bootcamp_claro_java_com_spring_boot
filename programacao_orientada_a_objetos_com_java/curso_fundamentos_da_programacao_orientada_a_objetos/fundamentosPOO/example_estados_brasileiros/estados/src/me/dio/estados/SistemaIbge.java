package me.dio.estados;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro go = EstadoBrasileiro.GOIAS;
        System.out.println("Dados do estado de " + go);
        System.out.println(go.getSigla() + " - " + go.getNome() + " - " + go.getIbge());
    }
}
