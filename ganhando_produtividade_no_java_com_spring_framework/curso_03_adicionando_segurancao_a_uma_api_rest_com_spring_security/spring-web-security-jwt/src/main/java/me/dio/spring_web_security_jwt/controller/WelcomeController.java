package me.dio.spring_web_security_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return"Bem vindo ao meu Spring Boot Web Api";
    }

    @GetMapping("/users")
    public String users() {
        return "Usuario Autorizado!";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Usuario Administrador Autorizado!";
    }
}
