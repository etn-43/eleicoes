package br.eleicoes;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CandidatoDao {
    public Candidato obter() {
        Candidato c = new Candidato();
        c.setNome("Fabio");
        c.setId(0);
        c.setIdade(45);
        return c;
    }
}
