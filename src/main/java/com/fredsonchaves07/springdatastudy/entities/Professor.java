package com.fredsonchaves07.springdatastudy.entities;

import javax.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String prontuario;

    @Deprecated
    public Professor() {}

    public Professor(String nome, String prontuario) {
        this.nome = nome;
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
