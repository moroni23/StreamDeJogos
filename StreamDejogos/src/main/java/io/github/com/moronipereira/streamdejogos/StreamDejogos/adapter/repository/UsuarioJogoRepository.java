package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.repository;


import io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.entities.UsuarioJogoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJogoRepository extends JpaRepository<UsuarioJogoEntity, Integer> {
}
