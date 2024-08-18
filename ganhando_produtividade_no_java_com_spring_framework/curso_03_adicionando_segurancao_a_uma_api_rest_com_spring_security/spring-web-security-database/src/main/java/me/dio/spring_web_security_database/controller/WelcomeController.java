package me.dio.spring_web_security_database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Bem vindo ao meu Spring Boot Web API";
    }

    @GetMapping("/users")
    public String users() {
        return "Usuario autorizado";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
}

