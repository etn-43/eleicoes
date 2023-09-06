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
                return dao.votar("Voto para o candidato "+v.getCandidato()+" realizado com sucesso");
            }
        }
        return dao.votar("Candidato não encontrado");
    }

    public String apagar(Candidato c) {
        int posicao = 0;
        for(Candidato candidatos : dao.getLista()) {
            if(candidatos.getNome().matches(c.getNome())) {
                dao.getLista().remove(posicao);
                return dao.apagar("O candidato "+c.getNome()+" foi apagado");
            }
            posicao +=1;
        }
        return dao.apagar("Candidato não encontrado");
    }
}
