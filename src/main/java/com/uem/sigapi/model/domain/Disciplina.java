package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="disciplinas")
public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private Curso curso;

 
}

