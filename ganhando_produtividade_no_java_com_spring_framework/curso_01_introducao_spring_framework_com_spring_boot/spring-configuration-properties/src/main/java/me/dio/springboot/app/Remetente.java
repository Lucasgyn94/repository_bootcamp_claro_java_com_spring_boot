package me.dio.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    private String nome;
    private String email;
    private List<Long> telefones;

    // getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
