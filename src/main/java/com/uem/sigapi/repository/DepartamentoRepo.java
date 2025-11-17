package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Departamento;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoRepo {

    private static List<Departamento> departamentos = new ArrayList<>();

    static {
        departamentos.add(new Departamento("Cadeiras Gerais", "Matérias básicas de engenharia"));
        departamentos.add(new Departamento("Civil", "Engenharia Civil"));
        departamentos.add(new Departamento("Electrotécnica", "Engenharia Eléctrica"));
        departamentos.add(new Departamento("Geologia", "Geologia para todos os cursos"));
        departamentos.add(new Departamento("Mecânica", "Engenharia Mecânica"));
        departamentos.add(new Departamento("Química", "Engenharia Química"));
    }

    public void save(Departamento departamento) {
        departamentos.add(departamento);
    }

    public List<Departamento> findAll() {
        return departamentos;
    }

    public Departamento findByNome(String nome) {
        return departamentos.stream()
                .filter(d -> d.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }
}
