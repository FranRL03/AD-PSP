package com.example.ClaseAnotacion.Clases;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "curso")
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_curso")
    private String nombreCurso ;

    private String tutor;


    @OneToMany(mappedBy = "curso")
    @Builder.Default
    private List<Alumno> alumnos = new ArrayList<>();

}