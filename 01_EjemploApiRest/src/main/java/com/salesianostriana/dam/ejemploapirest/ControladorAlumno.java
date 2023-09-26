package com.salesianostriana.dam.ejemploapirest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ControladorAlumno {

    private final RepositorioAlumno repositorioAlumno;

    @GetMapping("/alumno/")
    public List<Alumno> getAll(){
        return repositorioAlumno.findAll();
    }

}
