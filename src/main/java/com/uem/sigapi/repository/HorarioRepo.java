package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Horario;
import java.util.ArrayList;
import java.util.List;

public class HorarioRepo {

    private static List<Horario> horarios = new ArrayList<>();

    public void save(Horario horario) {
        horarios.add(horario);
    }

    public List<Horario> findAll() {
        return horarios;
    }
}

