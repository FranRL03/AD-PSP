package com.example.modeloDeDatos.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_producto")
    private String nombre;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "precio_oferta")
    private Double precioOferta;

    @Column(name = "tags")
    private String tags;

//    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
