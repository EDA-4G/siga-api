package com.uem.sigapi.repository;
import com.uem.sigapi.model.domain.Departamento;
import java.util.ArrayList;
import java.util.List;
public class DepartamentoRepo {
    public static List<Departamento> departamentos = new ArrayList<>();

    static{
        departamentos.add(new Departamento("Cadeiras Gerais", "Matérias básicas de engenharia"));
        departamentos.add(new Departamento("Civil", "Engenharia Civil"));
        departamentos.add(new Departamento("Electrotécnica", "Engenharia Eléctrica, Engenharia Eletronica, Engenharia Informatica"));
        departamentos.add(new Departamento("Geologia", "Para todos os cursos"));
        departamentos.add(new Departamento("Mecânica", "Engenharia de Gestao Industrial, Engenharia Mecânica"));
        departamentos.add(new Departamento("Química", "Engenharia Ambiental, Engenharia Química"));

    }
    public static Departamento findDepartamento(String nome) {
        return departamentos.stream().filter(d -> d.getNome().equals(nome)).findFirst().orElse(null);
    }
}
