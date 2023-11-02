package com.example.ejercicio_2_clase.repos;

import com.example.ejercicio_2_clase.models.CursoOnline;
import com.example.ejercicio_2_clase.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, CursoOnline> {
}