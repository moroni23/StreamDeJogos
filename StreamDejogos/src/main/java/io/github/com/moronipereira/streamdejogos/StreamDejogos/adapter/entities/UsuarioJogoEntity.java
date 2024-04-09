package io.github.com.moronipereira.streamdejogos.StreamDejogos.adapter.entities;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioJogoEntity {

    private double horas_jogadas;

    private String status;

}
