package me.dio.springboot.app;

public class Remetente {
    private String nome;
    private String email;

    // getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
