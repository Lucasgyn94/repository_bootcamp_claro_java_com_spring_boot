package me.dio.spring_web_security_jwt.controller;

import me.dio.spring_web_security_jwt.model.User;
import me.dio.spring_web_security_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService servico;

    @PostMapping
    public void postUsuario(@RequestBody User usuario) {
        servico.CriarUsuario(usuario);
    }
}
