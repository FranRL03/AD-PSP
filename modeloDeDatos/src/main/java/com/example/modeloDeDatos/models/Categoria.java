package com.example.modeloDeDatos.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class Categoria {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @ToString.Exclude
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "categoria_id")
    private List<Producto> productoes = new ArrayList<>();

}
