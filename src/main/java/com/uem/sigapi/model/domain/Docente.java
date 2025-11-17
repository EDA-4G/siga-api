package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="docentes")
public class Docente {
    private String nome;
    private String apelido;
    private String email;
    private String telefone;
    private String grauAcademico; // Licenciado, Mestre, Doutor
    private Departamento departamento;

    
}
