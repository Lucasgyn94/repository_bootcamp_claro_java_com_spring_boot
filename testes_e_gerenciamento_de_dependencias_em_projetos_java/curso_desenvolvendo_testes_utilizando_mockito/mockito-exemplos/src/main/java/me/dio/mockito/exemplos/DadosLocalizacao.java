package me.dio.mockito.exemplos;

public class DadosLocalizacao {

    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;

    public DadosLocalizacao(final String uf, final String cidade, final String logradouro, final String complemento, final String bairro) {
        this.uf = uf;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    // getters

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    // setters
    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
