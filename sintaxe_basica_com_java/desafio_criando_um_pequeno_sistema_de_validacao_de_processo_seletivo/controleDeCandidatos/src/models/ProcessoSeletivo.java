package models;

import java.util.List;

public class ProcessoSeletivo {
    private List<Candidato> candidatos;

    public ProcessoSeletivo() {

    }

    public ProcessoSeletivo(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }


    @Override
    public String toString() {
        return "ProcessoSeletivo{" +
                ", candidatos=" + candidatos +
                '}';
    }
}
