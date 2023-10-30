package com.example.ClaseAnotacion.Clases;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    private String nombre, apellido, email;

    private LocalDate fechaNac;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;


    //Helper
    public void addToCurso(Curso curso){
        this.curso = curso;
        curso.getAlumnos().add(this);
    }

    public void deleteFromCurso(Curso c){
        c.getAlumnos().remove(this);
        this.curso = null;
    }
}
