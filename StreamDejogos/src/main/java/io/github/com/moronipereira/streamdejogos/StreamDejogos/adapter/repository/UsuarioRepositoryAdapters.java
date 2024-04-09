package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.repository;


import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Usuario;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class UsuarioRepositoryAdapters implements UsuarioRepositoryPort {


    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario deleteUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public List<Usuario> findall() {
        return List.of();
    }
}
