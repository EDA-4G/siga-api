package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoRepo {

    private static List<Curso> cursos = new ArrayList<>();
    private DepartamentoRepo departamentoRepo = new DepartamentoRepo();

    static {
        
    }

    public CursoRepo() {
        cursos.add(new Curso("Engenharia Ambiental", 5, departamentoRepo.findByNome("Cadeiras Gerais")));
        cursos.add(new Curso("Engenharia Civil", 5, departamentoRepo.findByNome("Civil")));
        cursos.add(new Curso("Engenharia Eléctrica", 5, departamentoRepo.findByNome("Electrotécnica")));
        cursos.add(new Curso("Engenharia Electrónica", 5, departamentoRepo.findByNome("Electrotécnica")));
        cursos.add(new Curso("Engenharia Gestão Industrial", 5, departamentoRepo.findByNome("Mecânica")));
        cursos.add(new Curso("Engenharia Informática", 5, departamentoRepo.findByNome("Electrotécnica")));
        cursos.add(new Curso("Engenharia Mecânica", 5, departamentoRepo.findByNome("Mecânica")));
        cursos.add(new Curso("Engenharia Química", 5, departamentoRepo.findByNome("Química")));
    }

    public void save(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> findAll() {
        return cursos;
    }

    public Curso findByNome(String nome) {
        return cursos.stream()
                .filter(c -> c.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }
}
