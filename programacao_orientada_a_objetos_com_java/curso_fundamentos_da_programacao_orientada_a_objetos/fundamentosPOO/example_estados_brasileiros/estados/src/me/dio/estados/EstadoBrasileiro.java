package me.dio.estados;

public enum EstadoBrasileiro {
    GOIAS("GO", "Goiania", 11),
    SAO_PAULO("SP", "Sao Paulo", 12),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 13),
    PIAUI("PI", "Piaui", 14),
    MARANHAO("MA", "Maranhao", 15)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }
}
