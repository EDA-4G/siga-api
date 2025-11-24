package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.SubscricaoMensagem;
import com.uem.sigapi.model.domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class SubscricaoMensagemRepo {

    private static List<SubscricaoMensagem> mensagens = new ArrayList<>();

    public SubscricaoMensagemRepo() {
        if (mensagens.isEmpty()) {
            Usuario us1=new Usuario();
            Usuario us2=new Usuario();
            Usuario us3=new Usuario();

            us1.setUsername("Carlos Nhaca");
            us2.setUsername("Pedro Mbanze");
            us3.setUsername("Ana Nqueto");
            
            mensagens.add(new SubscricaoMensagem(us1, "Mensagem sobre Analise Matemática I", "não"));
            mensagens.add(new SubscricaoMensagem(us2, "Mensagem sobre Programação Orientada a Obejtos I", "sim"));
            mensagens.add(new SubscricaoMensagem(us3, "Mensagem sobre Mecânica dos Fluidos", "não"));
        }
    }

    public void save(SubscricaoMensagem m) {
        mensagens.add(m);
    }

    public List<SubscricaoMensagem> findAll() {
        return mensagens;
    }

    public SubscricaoMensagem findByUsuario(String usuario) {
        
        return mensagens.stream()
                .filter(m -> m.getUsuario().equals(usuario))
                .findFirst()
                .orElse(null);
    } 
}
