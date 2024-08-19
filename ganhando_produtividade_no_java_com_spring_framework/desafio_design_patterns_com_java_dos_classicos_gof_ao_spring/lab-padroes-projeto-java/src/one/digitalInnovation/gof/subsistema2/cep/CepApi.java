package one.digitalInnovation.gof.subsistema2.cep;
/*
* Classe desenvolvida utilizando o padrao criacional Singleton Eager
* */
public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Goiania";
    }

    public String recuperarEstado(String cep) {
        return "Go";
    }
}
