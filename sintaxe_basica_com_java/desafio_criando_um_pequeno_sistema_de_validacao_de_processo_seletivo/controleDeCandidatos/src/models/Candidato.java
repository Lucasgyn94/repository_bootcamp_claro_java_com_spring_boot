package models;

public class Candidato {
    private String nome;
    private double valorSalarioPretendidoCandidato;

    public Candidato() {
    }

    public Candidato(String nome, double valorSalarioPretendidoCandidato) {
        this.nome = nome;
        this.valorSalarioPretendidoCandidato = valorSalarioPretendidoCandidato;
    }

    public Candidato(double salarioPretendido) {
    }

    public String getNome() {
        return nome;
    }

    public double getValorSalarioPretendidoCandidato() {
        return valorSalarioPretendidoCandidato;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", valorSalarioPretendidoCandidato=" + valorSalarioPretendidoCandidato +
                '}';
    }
}
