package io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports;


import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Jogo;

import java.util.List;

public interface UsuarioJogoServicePort {

   Jogo saveJogo(Jogo jogo);
   List<Jogo> findAllGame();
}
