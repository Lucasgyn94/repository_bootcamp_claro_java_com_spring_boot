package me.dio.springWebApi.repository;

import me.dio.springWebApi.handler.BusinessException;
import me.dio.springWebApi.handler.CampoObrigatorioException;
import me.dio.springWebApi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin() == null) {
            throw new CampoObrigatorioException("login");
        }

        if (usuario.getPassword() == null) {
            throw new CampoObrigatorioException("password");
        }
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        } else {
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando todos os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Lucas","senha"));
        usuarios.add(new Usuario("Tampinha","masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("Lucas", "senha");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
        return new Usuario("Lucas", "senha");
    }


}
