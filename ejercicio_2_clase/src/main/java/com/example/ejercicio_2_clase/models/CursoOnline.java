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
public class CursoOnline {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "puntuacion")
    private Integer puntuacion;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @OneToMany(
            mappedBy="cursoOnline",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Video> videos = new ArrayList<>();

    //HELPER

    public void addProfesor(Profesor p){
        this.profesor = p;
        p.getCursoOnlines().add(this);
    }

    public void deleteProfesor(Profesor p){
        p.getCursoOnlines().remove(this);
        this.profesor = p;
    }

    //=====================================================================

    public void addVideo (Video v) {
        videos.add(v);
        v.setCursoOnline(this);
    }

    public void removeVideo(Video v) {
        videos.remove(v);
        v.setCursoOnline(null);
    }

}
