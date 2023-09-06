package br.eleicoes;

public class Voto {

    private String candidato;
    private int votos;
    private String notificacaoVoto;

    public String getNotificacaoVoto() {
        return notificacaoVoto;
    }

    public void setNotificacaoVoto(String notificacaoVoto) {
        this.notificacaoVoto = notificacaoVoto;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}
