package com.example.ejercicio_2_clase;

import com.example.ejercicio_2_clase.models.CursoOnline;
import com.example.ejercicio_2_clase.models.Profesor;
import com.example.ejercicio_2_clase.repos.CursoOnlineRepository;
import com.example.ejercicio_2_clase.repos.ProfesorRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final CursoOnlineRepository cursoOnlineRepository;
    private final ProfesorRepository profesorRepository;

    @PostConstruct
    public void init(){

        Profesor p1 = Profesor.builder()
                .nombre("Luismi")
                .email("luismi@gmail.com")
                .puntuacion(8)
                .build();


        profesorRepository.save(p1);

        CursoOnline c1 = CursoOnline.builder()
                .nombre("Java Desde Cero")
                .puntuacion(7)
                .build();

        CursoOnline c2 = CursoOnline.builder()
                .nombre("Base de Datos")
                .puntuacion(7)
                .build();

        cursoOnlineRepository.saveAll(List.of(c1, c2));



        c1.addProfesor(p1);
        c2.addProfesor(p1);

        System.out.println(p1);
        System.out.println(c1);
        System.out.println(c2);








    }
}
