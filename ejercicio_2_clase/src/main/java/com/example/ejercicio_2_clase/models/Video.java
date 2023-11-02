package com.example.ejercicio_2_clase.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
//@IdClass(VideoPk.class)
public class Video {

    //@Id
    @ManyToOne
    private CursoOnline cursoOnline;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "orden")
    private String orden;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "url")
    private String url;

    public VideoPk getId() {

        return new VideoPk(cursoOnline, id);
    }

    public void setId(VideoPk pk) {
        this.cursoOnline = pk.getCursoOnline();
        this.id = pk.getId();
    }




}
