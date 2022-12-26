package com.fredsonchaves07.springdatastudy.repositories;

import com.fredsonchaves07.springdatastudy.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
