package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="subscricoes")
public class Subscricao {
    private Estudante estudante;
    private Curso curso;
    private String situacao;
    
}

