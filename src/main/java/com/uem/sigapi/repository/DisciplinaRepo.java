package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaRepo {

    private static List<Disciplina> disciplinas = new ArrayList<>();
    private CursoRepo cursoRepo = new CursoRepo();

    public DisciplinaRepo() {
        disciplinas.add(new Disciplina("Matemática I", 60, cursoRepo.findByNome("Engenharia Civil")));
        disciplinas.add(new Disciplina("Física I", 60, cursoRepo.findByNome("Engenharia Civil")));
        disciplinas.add(new Disciplina("Programação I", 60, cursoRepo.findByNome("Engenharia Informática")));
        disciplinas.add(new Disciplina("Circuitos Eléctricos", 60, cursoRepo.findByNome("Engenharia Eléctrica")));
        disciplinas.add(new Disciplina("Mecânica dos Fluidos", 60, cursoRepo.findByNome("Engenharia Mecânica")));
    }

    public void save(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> findAll() {
        return disciplinas;
    }

    public Disciplina findByNome(String nome) {
        return disciplinas.stream()
                .filter(d -> d.getNomeDisciplina().equals(nome))
                .findFirst()
                .orElse(null);
    }
}
