package me.dio.springboot.repository;

import me.dio.springboot.model.Usuario;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
    // Query Method - Retorna a lista de usuários contendo a parte do name
    List<Usuario> findByNameContaining(String name);

    // Query Override - Retorna a lista de usuários contendo a parte do name
    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:name%")
    List<Usuario> filtrarPorNome(@Param("name") String name);

    // Query Method - Retorna um usuário pelo campo username
    Usuario findByUsername(String username);
}
