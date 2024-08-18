package me.dio.spring_web_security_jwt.controller;

import me.dio.spring_web_security_jwt.dto.LoginDTO;
import me.dio.spring_web_security_jwt.dto.SessaoDTO;
import me.dio.spring_web_security_jwt.model.User;
import me.dio.spring_web_security_jwt.repository.UserRepository;
import me.dio.spring_web_security_jwt.security.JWTCreator;
import me.dio.spring_web_security_jwt.security.JWTObject;
import me.dio.spring_web_security_jwt.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {
    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private SecurityConfig securityConfig;

    @Autowired
    private UserRepository repository;

    @PostMapping("/login")
    public SessaoDTO logar(@RequestBody LoginDTO login) {
        User user = repository.findByUsername(login.getUsername());
        if (user!=null) {
            boolean passwordOk = encoder.matches(login.getPassword(), user.getPassword());

            if (!passwordOk) {
                throw new RuntimeException("Senha invalida para o login: " + login.getUsername());
            }
            // enviando objeto sessao para retornar informacoes do usuario
            SessaoDTO sessao = new SessaoDTO();
            sessao.setLogin(user.getUsername());

            JWTObject jwtObject = new JWTObject();
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration(new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION));
            jwtObject.setRoles(user.getRoles());
            sessao.setToken(JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject));
            return sessao;
        } else {
            throw new RuntimeException("Erro ao tentar fazer login");
        }
    }
}
