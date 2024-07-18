package views;

import models.Candidato;

import java.util.List;
import java.util.Scanner;

public class ProcessoSeletivoViews {

    public double obtemSalarioPretendidoCandidato() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu salario pretendido: ");
        return leitura.nextDouble();
    }

    public void mostrarCandidatosSelecionados(List<Candidato> candidatos) {
        System.out.println("Candidatos selecionados para a entrevista:");
        for (Candidato candidato : candidatos) {
            System.out.println("Candidato: " + candidato.getNome() + ", Salário Pretendido: " + candidato.getValorSalarioPretendidoCandidato());
        }
    }

    public void mostrarMensagemContatoCandidatos(List<Candidato> candidatos) {
        for (Candidato candidato : candidatos) {
            System.out.println("Candidato: " + candidato.getNome() + " está disponível para contato do RH.");
        }
    }
}
