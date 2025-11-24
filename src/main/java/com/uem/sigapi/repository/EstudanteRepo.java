package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Estudante;
import java.util.ArrayList;
import java.util.List;

public class EstudanteRepo {

    private static List<Estudante> estudantes = new ArrayList<>();
    private CursoRepo cursoRepo = new CursoRepo();

    public EstudanteRepo() {
        estudantes.add(new Estudante("Carlos Nhaca", "Nhaca", "carlos@uem.mz", "842300001", "Masculino", "2001-04-12", cursoRepo.findByNome("Engenharia Civil")));
        estudantes.add(new Estudante("Fatima Nhate", "Nhate", "fatima@uem.mz", "842300002", "Feminino", "2002-07-23", cursoRepo.findByNome("Engenharia Informática")));
        estudantes.add(new Estudante("Joao Chissano", "Chissano", "joao@uem.mz", "842300003", "Masculino", "2000-11-01", cursoRepo.findByNome("Engenharia Mecânica")));
        estudantes.add(new Estudante("Aminata Muchanga", "Muchanga", "aminata@uem.mz", "842300004", "Feminino", "2001-02-17", cursoRepo.findByNome("Engenharia Ambiental")));
        estudantes.add(new Estudante("Pedro Mbanze", "Mbanze", "pedro@uem.mz", "842300005", "Masculino", "2003-05-29", cursoRepo.findByNome("Engenharia Química")));
        estudantes.add(new Estudante("Ana Nqueto", "Nqueto", "ana@uem.mz", "842300006", "Feminino", "2002-09-14", cursoRepo.findByNome("Engenharia Eléctrica")));
    }

    public void save(Estudante estudante) {
        estudantes.add(estudante);
    }

    public List<Estudante> findAll() {
        return estudantes;
    }

    public Estudante findByNome(String nome) {
        return estudantes.stream()
                .filter(e -> e.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }
}

