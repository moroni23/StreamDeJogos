package io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.services;

import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Jogo;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioJogoRepositoryPort;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioJogoServicePort;

import java.util.List;

public class UsuarioJogoService implements UsuarioJogoServicePort {

   private final UsuarioJogoRepositoryPort usuarioJogoRepositoryPort;

    public UsuarioJogoService(UsuarioJogoRepositoryPort usuarioJogoRepositoryPort) {
        this.usuarioJogoRepositoryPort = usuarioJogoRepositoryPort;
    }


    @Override
    public Jogo saveJogo(Jogo jogo) {
        return usuarioJogoRepositoryPort.saveJogo(jogo);
    }

    @Override
    public List<Jogo> findAllGame() {
        return usuarioJogoRepositoryPort.findAllGame();
    }
}
