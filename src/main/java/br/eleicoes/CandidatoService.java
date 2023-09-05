package br.eleicoes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CandidatoService {
    @Inject
    CandidatoDao dao;
    public Candidato obter() {
        return dao.obter();
    }
}
