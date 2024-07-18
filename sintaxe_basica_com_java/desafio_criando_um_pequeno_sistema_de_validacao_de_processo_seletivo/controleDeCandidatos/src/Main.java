import controllers.ProcessoSeletivoController;

public class Main {
    public static void main(String[] args) {
        ProcessoSeletivoController psc = new ProcessoSeletivoController();
        //psc.verificadorCandidatoCompativel
        System.out.println("\n*** SELECIONANDO CANDIDATOS PARA ENTREVISTA ***\n");
        psc.selecionarCandidatosParaEntrevista();
        System.out.println("\n*** IMPRIMINDO LISTA CANDIDATOS SELECIONADOS RH ***\n");
        psc.imprimirListaCandidatosRH();
        System.out.println("\n*** TENTANDO CONTATO COM CANDIDATOS SELECIONADOS ***\n");
        psc.tentarContatoComCandidatos();
    }
}
