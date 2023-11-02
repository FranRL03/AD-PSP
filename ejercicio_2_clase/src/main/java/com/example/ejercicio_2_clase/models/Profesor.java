package com.example.ejercicio_2_clase.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "puntuacion")
    private Integer puntuacion;

    @OneToMany(mappedBy = "profesor", orphanRemoval = true)
    @Builder.Default
    private List<CursoOnline> cursoOnlines = new ArrayList<>();

}
