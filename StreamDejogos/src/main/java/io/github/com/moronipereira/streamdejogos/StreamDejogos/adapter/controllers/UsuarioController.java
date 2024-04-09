package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.controllers;


import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Usuario;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Usuarios")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioServicePort usuarioServicePort;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioServicePort.saveUsuario(usuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioServicePort.updateUsuario(usuario);
    }

    @DeleteMapping
    public Usuario deleteUsuario(@RequestBody Usuario usuario) {
        return usuarioServicePort.deleteUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioServicePort.findall();
    }

}
