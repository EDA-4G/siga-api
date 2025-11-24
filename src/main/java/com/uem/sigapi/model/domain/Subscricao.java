package com.uem.sigapi.model.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="subscricoes")
public class Subscricao {
    private Estudante estudante;
    private Curso curso;
    private String situacao;

}

