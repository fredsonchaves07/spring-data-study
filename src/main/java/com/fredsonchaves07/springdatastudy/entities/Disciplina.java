package com.fredsonchaves07.springdatastudy.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina {

    @Id
    private Long id;

    @Column(nullable = false)
    private String nome;

    private Integer semestre;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;

    public Disciplina(Long id, String nome, Integer semestre, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.semestre = semestre;
        this.professor = professor;
    }

    @Deprecated
    public Disciplina(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public Professor getProfessor() {
        return professor;
    }
}
