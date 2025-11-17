package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="cursos")
public class Curso {
    private String nome;
    private int duracao;
    

}
