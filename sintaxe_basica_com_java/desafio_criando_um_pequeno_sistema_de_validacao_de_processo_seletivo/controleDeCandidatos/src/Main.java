import controllers.ProcessoSeletivoController;

public class Main {
    public static void main(String[] args) {
        ProcessoSeletivoController psc = new ProcessoSeletivoController();
        //psc.verificadorCandidatoCompativel();
        psc.selecionarCandidatosParaEntrevista();

    }
}
