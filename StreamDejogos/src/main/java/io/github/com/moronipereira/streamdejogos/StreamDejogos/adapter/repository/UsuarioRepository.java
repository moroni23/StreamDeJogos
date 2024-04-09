package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.repository;

import io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
