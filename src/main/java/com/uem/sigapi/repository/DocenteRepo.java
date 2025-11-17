package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Docente;
import java.util.ArrayList;
import java.util.List;

public class DocenteRepo {

    private static List<Docente> docentes = new ArrayList<>();
    private DepartamentoRepo departamentoRepo = new DepartamentoRepo();

    public DocenteRepo() {
        docentes.add(new Docente("Dr. Afonso Maguiguana", "Zé", "afonso@uem.mz", "842345678", "Mestre", departamentoRepo.findByNome("Civil")));
        docentes.add(new Docente("Dra. Lúcia Mavungo", "Lulu", "lucia@uem.mz", "842345679", "Doutora", departamentoRepo.findByNome("Electrotécnica")));
        docentes.add(new Docente("Eng. Mateo Manjate", "Mateo", "mateo@uem.mz", "842345680", "Licenciado", departamentoRepo.findByNome("Mecânica")));
        docentes.add(new Docente("Eng. Anabela Nhancale", "Nabela", "anabela@uem.mz", "842345681", "Mestre", departamentoRepo.findByNome("Química")));
        docentes.add(new Docente("Dr. José Sambo", "José", "jose@uem.mz", "842345682", "Doutor", departamentoRepo.findByNome("Cadeiras Gerais")));
        docentes.add(new Docente("Dra. Graça Nharingue", "Graça", "graca@uem.mz", "842345683", "Doutora", departamentoRepo.findByNome("Geologia")));
    }

    public void save(Docente docente) {
        docentes.add(docente);
    }

    public List<Docente> findAll() {
        return docentes;
    }

    public Docente findByNome(String nome) {
        return docentes.stream()
                .filter(d -> d.getNome().contains(nome))
                .findFirst()
                .orElse(null);
    }
}

