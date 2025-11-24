package com.uem.sigapi.repository;

import com.uem.sigapi.model.domain.Subscricao;
import com.uem.sigapi.model.domain.Estudante;
import com.uem.sigapi.model.domain.Curso;

import java.util.ArrayList;
import java.util.List;

public class SubscricaoRepo {

    private static List<Subscricao> subscricoes = new ArrayList<>();

    public SubscricaoRepo() {
        if(subscricoes.isEmpty()){
            Estudante es1= new Estudante();
            Estudante es2= new Estudante();
            Estudante es3= new Estudante();
            Estudante es4= new Estudante();
            Estudante es5= new Estudante();
            
            Curso cur1=new Curso();
            Curso cur2=new Curso();
            Curso cur3=new Curso();
            Curso cur4=new Curso();
            Curso cur5=new Curso();

            es1.setNome("Carlos Nhaca");
            es2.setNome("Fatima Nhate");
            es3.setNome("Joao Chissano");
            es4.setNome("Pedro Mbanze");
            es5.setNome("Ana Nqueto");

            cur1.setNome("Engenharia Informatica");
            cur2.setNome("Engenharia Ambiental");
            cur3.setNome("Engenharia Electrica");
            cur4.setNome("Engenharia Electronica");
            cur5.setNome("Engenharia Mecanica");

            subscricoes.add(new Subscricao(es1,cur1,"Inativo"));
            subscricoes.add(new Subscricao(es2,cur3,"Ativo"));
            subscricoes.add(new Subscricao(es3,cur5,"Ativo"));
            subscricoes.add(new Subscricao(es4,cur2,"Inativo"));
            subscricoes.add(new Subscricao(es5,cur4,"Inativo"));
        }
    }

    public void save(Subscricao s) {
        subscricoes.add(s);
    }

    public List<Subscricao> findAll() {
        return subscricoes;
    }
}

