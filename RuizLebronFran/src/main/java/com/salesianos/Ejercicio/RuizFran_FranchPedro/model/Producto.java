package com.salesianos.Ejercicio.RuizFran_FranchPedro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @Generated
    private Long id;
    private String nombre, categoria;
    private double descuento;
    private double pvp;
    private List<String> img;

    @ManyToOne
    private Categoria category;

}
