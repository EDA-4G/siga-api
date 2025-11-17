package com.uem.sigapi.model.domain;
import lombok.*;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor

@Entity(name="subsricaomensagens")
public class SubscricaoMensagem {
    private Subscricao subscricao;
    private String mensagem;

}

