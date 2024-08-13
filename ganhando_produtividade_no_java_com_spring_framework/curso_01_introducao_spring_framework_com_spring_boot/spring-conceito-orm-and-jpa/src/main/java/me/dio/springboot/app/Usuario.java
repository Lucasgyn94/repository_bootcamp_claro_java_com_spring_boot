package me.dio.springboot.app;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;

    private String nome;

    @Column(name = "login_usuario")
    private String login;

    @Column(name = "senha_usuario")
    private String senha;
}
