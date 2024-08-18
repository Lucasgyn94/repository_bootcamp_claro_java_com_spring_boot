package me.dio.spring_security_configure_adapter;

import org.springframework.security.access.prepost.PreAuthorize;
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

