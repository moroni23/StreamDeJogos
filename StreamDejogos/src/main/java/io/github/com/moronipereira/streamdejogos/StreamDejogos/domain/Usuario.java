package io.github.com.moronipereira.streamdejogos.StreamDejogos.domain;

public class Usuario {

    private Integer id;
    private String nome;
    private String dataNascimento;


    public Usuario(Integer id, String dataNascimento, String nome) {
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

