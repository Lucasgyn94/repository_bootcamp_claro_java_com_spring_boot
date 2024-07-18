package controllers;

import models.Candidato;
import services.ProcessoSeletivoService;
import views.ProcessoSeletivoViews;

import java.util.List;

public class ProcessoSeletivoController {

    ProcessoSeletivoService processoSeletivoService;
    ProcessoSeletivoViews processoSeletivoViews;

    public ProcessoSeletivoController() {
        this.processoSeletivoService = new ProcessoSeletivoService();
        this.processoSeletivoViews = new ProcessoSeletivoViews();
    }

    public void verificadorCandidatoCompativel() {
        double salarioPretendido = processoSeletivoViews.obtemSalarioPretendidoCandidato();
        Candidato candidato = new Candidato(salarioPretendido);
        processoSeletivoService.analisarCandidato(candidato);
    }

    public void selecionarCandidatosParaEntrevista() {
        List<Candidato> selecionados = processoSeletivoService.selecionarCandidatosParaEntrevista();
        processoSeletivoViews.mostrarCandidatosSelecionados(selecionados);
    }

    public void imprimirListaCandidatosRH() {
        List<Candidato> selecionados = processoSeletivoService.selecionarCandidatosParaEntrevista();
        processoSeletivoViews.mostrarMensagemContatoCandidatos(selecionados);
    }

    public void tentarContatoComCandidatos() {
        List<Candidato> selecionados = processoSeletivoService.selecionarCandidatosParaEntrevista();
        processoSeletivoService.tentarContatoComCandidatos(selecionados);
    }
}
