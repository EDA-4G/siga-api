package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="departamentos")
public class Departamento {
    private String nome;
    private String descricao;

  
}

