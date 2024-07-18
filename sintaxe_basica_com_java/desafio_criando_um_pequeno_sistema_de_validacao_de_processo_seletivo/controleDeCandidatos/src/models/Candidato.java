package models;

public class Candidato {

    private double valorSalarioPretendidoCandidato;


    public Candidato() {

    }

    public Candidato(double valorSalarioPretendidoCandidato) {
        this.valorSalarioPretendidoCandidato = valorSalarioPretendidoCandidato;
    }


    public double getValorSalarioPretendidoCandidato() {
        return valorSalarioPretendidoCandidato;
    }



    @Override
    public String toString() {
        return "Candidato{" +
                ", valorSalarioPretendidoCandidato=" + valorSalarioPretendidoCandidato +
                '}';
    }
}
