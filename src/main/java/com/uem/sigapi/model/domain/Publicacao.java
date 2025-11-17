package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="publicacoes")
public class Publicacao {
    private String descricaoDocumento;
    private String extensao;
    private boolean eDestaque;
    private String situacao;

 
}

