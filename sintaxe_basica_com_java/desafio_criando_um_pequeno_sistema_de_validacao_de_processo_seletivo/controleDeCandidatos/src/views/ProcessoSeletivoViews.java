package views;

import models.Candidato;

import java.util.List;
import java.util.Scanner;

public class ProcessoSeletivoViews {

    public double obtemSalarioPretendidoCandidato() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu salario pretendido? ");
        double salarioPretendido = leitura.nextDouble();
        return salarioPretendido;
    }


    public void mostrarCandidatosSelecionados(List<Candidato> candidatos) {
        System.out.println("Candidatos selecionados para entrevista: ");
        for (Candidato candidato : candidatos) {
            System.out.println("Candidato com salario pretendido de: " + candidato.getValorSalarioPretendidoCandidato());
        }
    }



}
