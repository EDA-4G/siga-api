package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Publicacao;
import java.util.ArrayList;
import java.util.List;

public class PublicacaoRepo {

    private static List<Publicacao> publicacoes = new ArrayList<>();

    public PublicacaoRepo() {
        if (publicacoes.isEmpty()) {
            publicacoes.add(new Publicacao("Slide de Matemática I", "pdf", true, "activo"));
            publicacoes.add(new Publicacao("Exercícios Programação I", "pdf", false, "activo"));
            publicacoes.add(new Publicacao("Trabalho Mecânica dos Fluidos", "docx", false, "activo"));
        }
    }

    public void save(Publicacao p) {
        publicacoes.add(p);
    }

    public List<Publicacao> findAll() {
        return publicacoes;
    }
}

