package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="estudantes")
public class Estudante {
    private String nome;
    private String apelido;
    private String email;
    private String telefone;
    private String genero;
    private String dataNascimento;
    private Curso curso;
    
}

