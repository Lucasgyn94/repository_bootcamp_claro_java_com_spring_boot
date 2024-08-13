package me.dio.springboot;

import me.dio.springboot.model.Usuario;
import me.dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<Usuario> usuarios = repository.filtrarPorNome("Lucas");
        for (Usuario u: usuarios) {
            System.out.println(u);
        }
    }
    private void InsertUser() {
        Usuario user = new Usuario();
        user.setName("Lucas");
        user.setUsername("needslucas");
        user.setPassword("dio123");

        repository.save(user);

        for (Usuario u : repository.findAll()) {
            System.out.println(u);
        }

    }
}
