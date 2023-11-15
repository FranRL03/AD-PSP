package com.salesianostriana.dam.ejemploapirest.repo;

import com.salesianostriana.dam.ejemploapirest.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {
}
