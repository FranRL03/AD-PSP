package com.example.ClaseAnotacion;

import com.example.ClaseAnotacion.Clases.Alumno;
import com.example.ClaseAnotacion.Clases.Curso;
import com.example.ClaseAnotacion.repo.AlumnoRepostory;
import com.example.ClaseAnotacion.repo.CursoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class InitData {

    private final AlumnoRepostory alumnoRepostory;
    private final CursoRepository cursoRepository;

    @PostConstruct
    public void init(){

        Curso c1 = Curso.builder()
                .nombreCurso("2ºDam")
                .tutor("Luismi")
                .build();

        cursoRepository.save(c1);

        Alumno a1 = Alumno.builder()
                .nombre("Fran")
                .apellido("Ruiz")
                .email("fran@gmail.com")
                .fechaNac(LocalDate.of(2003, 2, 7))
                .build();

        alumnoRepostory.save(a1);

        a1.addToCurso(c1);

        System.out.println(a1);
        System.out.println(c1);

    }
}
