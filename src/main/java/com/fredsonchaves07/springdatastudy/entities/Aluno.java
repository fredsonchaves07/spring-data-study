package com.fredsonchaves07.springdatastudy.entities;

import javax.persistence.*;

import java.util.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Integer idade;

    @ManyToMany(mappedBy = "alunos")
    private List<Disciplina> disciplinas;

    public Aluno() {}

    public Aluno(Long id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
