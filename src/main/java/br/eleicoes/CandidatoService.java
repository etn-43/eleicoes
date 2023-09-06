package br.eleicoes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CandidatoService {
    @Inject
    CandidatoDao dao;
    private int id = 0;
    public Candidato obter() {

        return dao.obter();
    }

    public Candidato adicionar(Candidato c) {
        id += 1;
        c.setId(id);
        return dao.adicionar(c);
    }

    public List<Candidato> buscarCandidatos() {
        return dao.buscarCandidatos();
    }

    public String votar(Voto v) {
        for(Candidato candidatos : dao.getLista()) {
            if(candidatos.getNome().matches(v.getCandidato())) {
                candidatos.setNumeroVotos(v.getVotos()+candidatos.getNumeroVotos());
                v.setNotificacaoVoto("Voto para o candidato "+v.getCandidato()+" realizado com sucesso");
                return dao.votar(v);
            }
        }
        v.setNotificacaoVoto("Candidato não encontrado");
        return dao.votar(v);
    }
}
