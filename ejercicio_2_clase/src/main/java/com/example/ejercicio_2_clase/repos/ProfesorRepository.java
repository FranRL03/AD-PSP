package com.example.ejercicio_2_clase.repos;

import com.example.ejercicio_2_clase.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}