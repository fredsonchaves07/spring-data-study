package com.fredsonchaves07.springdatastudy.repositories;

import com.fredsonchaves07.springdatastudy.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findbyNome(String nome);

    @Query("SELECT a FROM Aluno a WHERE a.nome like :nome% AND a.idade >= :idade")
    List<Aluno> findByNomeIdadeIgualOuMaior(String nome, Integer idade);
}
