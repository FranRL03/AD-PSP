package com.example.ClaseAnotacion.repo;

import com.example.ClaseAnotacion.Clases.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepostory extends JpaRepository<Alumno, Long> {
}
