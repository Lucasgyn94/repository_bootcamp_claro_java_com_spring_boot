package controllers;

import models.Candidato;
import services.ProcessoSeletivoService;
import views.ProcessoSeletivoViews;

import java.util.List;

public class ProcessoSeletivoController {

    ProcessoSeletivoService processoSeletivoService;
    Candidato candidato;
    ProcessoSeletivoViews processoSeletivoViews;

    public ProcessoSeletivoController() {
        this.processoSeletivoService = new ProcessoSeletivoService();
        this.processoSeletivoViews = new ProcessoSeletivoViews();
    }

    public void verificadorCandidatoCompativel() {
        double salarioPretendido = processoSeletivoViews.obtemSalarioPretendidoCandidato();
        candidato = new Candidato(salarioPretendido);
        processoSeletivoService.analisarCandidato(candidato);
    }
    public void selecionarCandidatosParaEntrevista() {
        List<Candidato> candidatosSelecionados = processoSeletivoService.selecionarCandidatosParaEntrevista();
        processoSeletivoViews.mostrarCandidatosSelecionados(candidatosSelecionados);
    }
}
