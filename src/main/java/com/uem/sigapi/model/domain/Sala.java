package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="salas")
public class Sala {
    private String nome;
    private int capacidade;
    private String localizacao;
    private String estado; // Disponivel, Ocupada, Manutencao

  
}

