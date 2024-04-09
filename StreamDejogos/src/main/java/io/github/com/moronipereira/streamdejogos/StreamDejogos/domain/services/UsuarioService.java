package io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.services;

import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Usuario;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioRepositoryPort;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioServicePort;

import java.util.List;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }


    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepositoryPort.saveUsuario(usuario);
    }

    @Override
    public Usuario deleteUsuario(Usuario usuario) {
        return usuarioRepositoryPort.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> findall() {
        return usuarioRepositoryPort.findall();
    }
}
