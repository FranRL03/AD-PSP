package com.example.ClaseAnotacion.repo;

import com.example.ClaseAnotacion.Clases.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
