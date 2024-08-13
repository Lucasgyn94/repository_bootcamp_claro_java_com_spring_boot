package me.dio.beans_vs_components.beansVsComponents;

public class ViaCepResponse {
    public String cep;
    public String logradouro;
    public String localidade;

    // getteres

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }
    // setteres

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
