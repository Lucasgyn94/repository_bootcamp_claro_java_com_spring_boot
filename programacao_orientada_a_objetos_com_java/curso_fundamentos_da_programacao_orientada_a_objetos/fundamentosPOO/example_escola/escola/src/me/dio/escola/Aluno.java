package me.dio.escola;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno() {

    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
