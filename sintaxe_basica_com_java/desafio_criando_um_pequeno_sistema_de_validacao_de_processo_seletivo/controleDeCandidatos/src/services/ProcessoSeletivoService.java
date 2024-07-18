package services;

import models.Candidato;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoService {

    private static final double SALARIO_BASE = 2000.00;

    public void analisarCandidato(Candidato candidato) {
        if (SALARIO_BASE > candidato.getValorSalarioPretendidoCandidato()) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (SALARIO_BASE == candidato.getValorSalarioPretendidoCandidato()) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS");
        }
    }

    public List<Candidato> selecionarCandidatosParaEntrevista() {
        String[] nomesCandidatos = {"Ana", "Bruno", "Carlos", "Daniel", "Eduardo", "Fernanda", "Gabriela", "Henrique", "Isabela", "João"};
        List<Candidato> selecionados = new ArrayList<>();

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < nomesCandidatos.length) {
            String nomeCandidato = nomesCandidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + nomeCandidato + " solicitou este valor de salário: " + salarioPretendido);
            if (SALARIO_BASE >= salarioPretendido) {
                System.out.println("O candidato " + nomeCandidato + " foi selecionado para a vaga.");
                selecionados.add(new Candidato(salarioPretendido));
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        return selecionados;
    }

    private double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
