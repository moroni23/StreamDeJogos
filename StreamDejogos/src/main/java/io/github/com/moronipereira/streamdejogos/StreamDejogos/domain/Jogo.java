package io.github.com.moronipereira.streamdejogos.StreamDejogos.domain;

public class Jogo {

    private double horas_jogadas;
    private String status;

    public Jogo(double horas_jogadas, String status) {
        this.horas_jogadas = horas_jogadas;
        this.status = status;
    }

    public double getHoras_jogadas() {
        return horas_jogadas;
    }

    public void setHoras_jogadas(double horas_jogadas) {
        this.horas_jogadas = horas_jogadas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
