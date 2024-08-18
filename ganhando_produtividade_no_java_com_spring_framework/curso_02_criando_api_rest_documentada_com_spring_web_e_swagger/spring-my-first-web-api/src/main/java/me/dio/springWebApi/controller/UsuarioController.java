package me.dio.springWebApi.controller;

import me.dio.springWebApi.model.Usuario;
import me.dio.springWebApi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return repository.findAll();
    }

    @GetMapping("/usuarios/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping("/usuarios")
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping
    public void putUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

}
