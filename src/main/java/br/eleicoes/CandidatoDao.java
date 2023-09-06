package br.eleicoes;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CandidatoDao {

    private List<Candidato> lista = new ArrayList<>();

    public List<Candidato> getLista() {
        return lista;
    }

    public CandidatoDao() {
        Candidato c = new Candidato();
        c.setNome("Fabio");
        c.setId(0);
        c.setIdade(45);
        lista.add(c);
    }


    public Candidato obter() {
        return lista.get(0);
    }


    public Candidato adicionar(Candidato c) {
        lista.add(c);
        return c;
    }

    public List<Candidato> buscarCandidatos() {
        return lista;
    }

    public String votar(Voto v) {
        return v.getNotificacaoVoto();
    }
}
