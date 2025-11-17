package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Horario;

import java.util.ArrayList;
import java.util.List;

public class HorarioRepo {

    private static List<Horario> horarios = new ArrayList<>();
    private CursoRepo cursoRepo = new CursoRepo();
    private TurmaRepo turmaRepo = new TurmaRepo();
    private DisciplinaRepo disciplinaRepo = new DisciplinaRepo();
    private DocenteRepo docenteRepo = new DocenteRepo();
    private SalaRepo salaRepo = new SalaRepo();

    public HorarioRepo() {
        if (horarios.isEmpty()) {
            horarios.add(new Horario(
                    cursoRepo.findByNome("Engenharia Civil"),
                    turmaRepo.findByNome("Turma A"),
                    disciplinaRepo.findByNome("Matemática I"),
                    docenteRepo.findByNome("José"),
                    salaRepo.findByNome("Sala 101"),
                    "Segunda", "08:00", "10:00"
            ));

            horarios.add(new Horario(
                    cursoRepo.findByNome("Engenharia Informática"),
                    turmaRepo.findByNome("Turma B"),
                    disciplinaRepo.findByNome("Programação I"),
                    docenteRepo.findByNome("Lúcia"),
                    salaRepo.findByNome("Sala 102"),
                    "Terça", "10:00", "12:00"
            ));

            horarios.add(new Horario(
                    cursoRepo.findByNome("Engenharia Mecânica"),
                    turmaRepo.findByNome("Turma C"),
                    disciplinaRepo.findByNome("Mecânica dos Fluidos"),
                    docenteRepo.findByNome("Mateo"),
                    salaRepo.findByNome("Sala 103"),
                    "Quarta", "14:00", "16:00"
            ));
        }
    }

    public void save(Horario h) {
        horarios.add(h);
    }

    public List<Horario> findAll() {
        return horarios;
    }
}


