package me.dio.spring_web_security_jwt.service;

import me.dio.spring_web_security_jwt.model.User;
import me.dio.spring_web_security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repositorio;
    @Autowired
    private PasswordEncoder encoder;

    public void CriarUsuario(User user) {
        String senha = user.getPassword();
        // criptografia antes de salvar
        user.setPassword(encoder.encode(senha));
        repositorio.save(user);
    }
}
