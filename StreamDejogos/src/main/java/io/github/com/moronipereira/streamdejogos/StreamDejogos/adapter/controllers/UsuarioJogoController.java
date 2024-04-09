package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.controllers;


import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Jogo;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioJogoServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jogos")
@AllArgsConstructor
public class UsuarioJogoController {

    private final UsuarioJogoServicePort usuarioJogoServicePort;

    @PostMapping
    public Jogo createJogo(@RequestBody Jogo jogo) {
        return usuarioJogoServicePort.saveJogo(jogo);
    }

    @GetMapping
    public List<Jogo> findAllGame() {
        return usuarioJogoServicePort.findAllGame();
    }
}
