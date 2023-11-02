package com.example.ejercicio_2_clase;

import com.example.ejercicio_2_clase.models.CursoOnline;
import com.example.ejercicio_2_clase.models.Profesor;
import com.example.ejercicio_2_clase.models.Video;
import com.example.ejercicio_2_clase.repos.CursoOnlineRepository;
import com.example.ejercicio_2_clase.repos.ProfesorRepository;
import com.example.ejercicio_2_clase.repos.VideoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final CursoOnlineRepository cursoOnlineRepository;
    private final ProfesorRepository profesorRepository;
    private final VideoRepository videoRepository;

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


        Video v1 = Video.builder()
                .cursoOnline(c1)
                .orden("primera")
                .titulo("Introducción a Java")
                .descripcion("¿Qué es Java, sus  funcionalidades y para que sirve")
                .url("http://localhost:8080")
                .build();

        Video v2 = Video.builder()
               .cursoOnline(c1)
                .orden("Segunda")
                .titulo("Clases y CRUD")
                .descripcion("Veremos las clases y los modelos que hay")
                .url("http://localhost:8080")
                .build();

        Video v3 = Video.builder()
                .cursoOnline(c2)
                .orden("Primera")
                .titulo("Create table")
                .descripcion("Veremos los create tables")
                .url("http://localhost:8080")
                .build();

        videoRepository.saveAll(List.of(v1, v2, v3));


//        Si descomento estas tres líneas me da nullpointer pero si las comentos me
//        funciona pero en Curso el atributo de videos me aparecen nullos
//        tambien tengo comentado en la clase Video el IdClass y el Id al atributo de CursoOnline

//        c1.addVideo(v1);
//        c1.addVideo(v2);
//        c2.addVideo(v3);

        c1.addProfesor(p1);
        c2.addProfesor(p1);



        System.out.println(p1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(v1);








    }
}
