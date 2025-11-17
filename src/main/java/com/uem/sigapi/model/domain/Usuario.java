package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="usuarios")
public class Usuario {
    private String username;
    private String password;
    private String role; 
}
