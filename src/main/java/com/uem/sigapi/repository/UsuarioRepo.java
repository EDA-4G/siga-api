package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepo {

    private static List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepo() {
        if (usuarios.isEmpty()) {
            usuarios.add(new Usuario("carlos", "12345", "estudante"));
            usuarios.add(new Usuario("fatima", "12345", "estudante"));
            usuarios.add(new Usuario("joao", "12345", "estudante"));
            usuarios.add(new Usuario("aminata", "12345", "estudante"));
            usuarios.add(new Usuario("pedro", "12345", "estudante"));
            usuarios.add(new Usuario("ana", "12345", "estudante"));
            usuarios.add(new Usuario("afonso", "abc123", "docente"));
            usuarios.add(new Usuario("lucia", "abc123", "docente"));
            usuarios.add(new Usuario("mateo", "abc123", "docente"));
            usuarios.add(new Usuario("anabela", "abc123", "docente"));
            usuarios.add(new Usuario("jose", "abc123", "docente"));
            usuarios.add(new Usuario("graca", "abc123", "docente"));
            usuarios.add(new Usuario("admin", "admin123", "admin"));
        }
    }

    public void save(Usuario u) {
        usuarios.add(u);
    }

    public List<Usuario> findAll() {
        return usuarios;
    }

    public Usuario findByUsername(String username) {
        return usuarios.stream()
                .filter(u -> u.getUsername().equalsIgnoreCase(username))
                .findFirst()
                .orElse(null);
    }
}

