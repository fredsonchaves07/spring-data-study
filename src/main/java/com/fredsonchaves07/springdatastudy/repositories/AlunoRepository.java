package com.fredsonchaves07.springdatastudy.repositories;

import com.fredsonchaves07.springdatastudy.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findbyNome(String nome);
}
