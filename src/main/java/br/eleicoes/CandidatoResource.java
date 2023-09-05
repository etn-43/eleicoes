package br.eleicoes;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
}
