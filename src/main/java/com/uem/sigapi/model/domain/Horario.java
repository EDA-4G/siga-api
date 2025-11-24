package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="horarios")
public class Horario {
    private Curso curso;
    private Turma turma;
    private Disciplina disciplina;
    private Docente docente;
    private Sala sala;
    private String diaSemana;
    private String horaInicio;
    private String horaFim;

}