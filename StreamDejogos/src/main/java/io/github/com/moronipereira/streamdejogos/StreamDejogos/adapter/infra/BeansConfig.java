package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.infra;


import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioJogoRepositoryPort;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioJogoServicePort;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioRepositoryPort;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.ports.UsuarioServicePort;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.services.UsuarioJogoService;
import io.github.com.moronipereira.streamdejogos.StreamDejogos.domain.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {


    @Bean
    public UsuarioServicePort usuarioServicePort(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public UsuarioJogoServicePort usuarioJogoServicePort(UsuarioJogoRepositoryPort usuarioJogoRepositoryPort) {
        return new UsuarioJogoService(usuarioJogoRepositoryPort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
