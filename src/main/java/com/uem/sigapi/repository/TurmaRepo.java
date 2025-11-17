package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Turma;
import java.util.ArrayList;
import java.util.List;

public class TurmaRepo {

    private static List<Turma> turmas = new ArrayList<>();

    public TurmaRepo() {
        turmas.add(new Turma("Turma A"));
        turmas.add(new Turma("Turma B"));
        turmas.add(new Turma("Turma C"));
    }

    public void save(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> findAll() {
        return turmas;
    }

    public Turma findByNome(String nome) {
        return turmas.stream()
                .filter(t -> t.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}

