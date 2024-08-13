package me.dio.springboot;

import me.dio.springboot.model.Usuario;
import me.dio.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Usuario user = new Usuario();
        user.setNome("Lucas");
        user.setUsername("needslucas");
        user.setPassword("dio123");

        repository.save(user);

        for (Usuario u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
