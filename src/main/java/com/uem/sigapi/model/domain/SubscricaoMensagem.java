package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="subsricaomensagens")
public class SubscricaoMensagem {
    private Usuario usuario;
    private String mensagem;
    private String lida;

}

