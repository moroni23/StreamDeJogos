package io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports;

import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Usuario;

import java.util.List;

public interface UsuarioServicePort {

    Usuario saveUsuario(Usuario usuario);
    Usuario updateUsuario(Usuario usuario);
    Usuario deleteUsuario(Usuario usuario);
    List<Usuario> findall();

}
