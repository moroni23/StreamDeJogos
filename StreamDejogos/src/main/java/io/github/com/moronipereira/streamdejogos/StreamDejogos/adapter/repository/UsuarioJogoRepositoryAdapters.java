package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.repository;

import io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.entities.UsuarioJogoEntity;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.Jogo;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioJogoRepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class UsuarioJogoRepositoryAdapters implements UsuarioJogoRepositoryPort {

    private final UsuarioJogoRepository usuarioJogoRepository;
    private final ModelMapper modelMapper;


    public Jogo saveJogo(Jogo jogo) {

        UsuarioJogoEntity entity = modelMapper.map(jogo, UsuarioJogoEntity.class);
        UsuarioJogoEntity save = usuarioJogoRepository.save(entity);
        return modelMapper.map(save, Jogo.class);
    }

    @Override
    public List<Jogo> findAllGame() {
        return null;
    }


    public List<Jogo> findAllGames() {
        List<UsuarioJogoEntity> all = usuarioJogoRepository.findAll();

        return all
                .stream()
                .map(usuarioJogoEntity -> modelMapper.map(usuarioJogoEntity, Jogo.class))
                .collect(Collectors.toList());
    }
}
