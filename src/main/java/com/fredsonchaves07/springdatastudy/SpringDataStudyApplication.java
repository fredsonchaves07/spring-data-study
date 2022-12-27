package com.fredsonchaves07.springdatastudy;

import com.fredsonchaves07.springdatastudy.entities.Professor;
import com.fredsonchaves07.springdatastudy.repositories.ProfessorRepository;
import com.fredsonchaves07.springdatastudy.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataStudyApplication implements CommandLineRunner {

    @Autowired
    private ProfessorService repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataStudyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Professor professor = new Professor("Fredson", "xyz");
//        repository.criar(professor);
    }
}
