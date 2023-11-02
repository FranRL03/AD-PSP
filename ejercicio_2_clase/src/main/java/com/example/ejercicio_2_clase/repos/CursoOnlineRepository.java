package com.example.ejercicio_2_clase.repos;

import com.example.ejercicio_2_clase.models.CursoOnline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline, Long> {
}