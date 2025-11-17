package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Sala;
import java.util.ArrayList;
import java.util.List;

public class SalaRepo {

    private static List<Sala> salas = new ArrayList<>();

   public SalaRepo() {
    if (salas.isEmpty()) {
        salas.add(new Sala("Sala 101", 30, "Bloco A", "Ativa"));
        salas.add(new Sala("Sala 102", 25, "Bloco B", "Ativa"));
        salas.add(new Sala("Sala 103", 20, "Bloco C", "Inativa"));
    }
}


    public void save(Sala sala) {
        salas.add(sala);
    }

    public List<Sala> findAll() {
        return salas;
    }

    public Sala findByNome(String nome) {
        return salas.stream()
                .filter(s -> s.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
