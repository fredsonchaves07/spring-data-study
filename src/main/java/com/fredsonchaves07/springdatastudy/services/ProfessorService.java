package com.fredsonchaves07.springdatastudy.services;

import com.fredsonchaves07.springdatastudy.entities.Professor;
import com.fredsonchaves07.springdatastudy.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public void criar(Professor professor) {
        repository.save(professor);
    }
}
