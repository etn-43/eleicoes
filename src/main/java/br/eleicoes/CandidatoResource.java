package br.eleicoes;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/api")
public class CandidatoResource {

    @Inject
    CandidatoService service;

    @Path("/candidato")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Candidato buscar() {

        return service.obter();
    }

    @Path("/candidatos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Candidato> buscarCandidatos() {
        return service.buscarCandidatos();
    }

    @Path("/candidato")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Candidato adicionar(Candidato c) {
        return service.adicionar(c);
    }

    @Path("/candidato")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String apagar(Candidato c) {
        return service.apagar(c);
    }

    @Path("/votar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String votar(Voto v){
        return service.votar(v);
    }
}
