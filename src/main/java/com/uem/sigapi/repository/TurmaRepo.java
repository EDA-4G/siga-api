package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Turma;
import java.util.ArrayList;
import java.util.List;

public class TurmaRepo {

    private static List<Turma> turmas = new ArrayList<>();
    private CursoRepo cursoRepo = new CursoRepo();

    public TurmaRepo() {
        if (turmas.isEmpty()) {
            turmas.add(new Turma("Turma A", 1, 1, cursoRepo.findByNome("Engenharia Civil")));
            turmas.add(new Turma("Turma B", 1, 1, cursoRepo.findByNome("Engenharia Informática")));
            turmas.add(new Turma("Turma C", 1, 1, cursoRepo.findByNome("Engenharia Mecânica")));
        }
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


