package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="turmas")
public class Turma {
    private String nomeTurma;
    private int ano;
    private int semestre;
    private Curso curso;
}
