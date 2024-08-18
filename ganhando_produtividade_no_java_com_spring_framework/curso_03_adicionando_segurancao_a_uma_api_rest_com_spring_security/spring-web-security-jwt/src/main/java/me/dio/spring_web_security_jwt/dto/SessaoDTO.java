package me.dio.spring_web_security_jwt.dto;

public class SessaoDTO {

    private String login;
    private String token;

    // getters

    public String getLogin() {
        return login;
    }

    public String getToken() {
        return token;
    }

    // setters

    public void setLogin(String login) {
        this.login = login;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
