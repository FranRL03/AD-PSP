package com.salesianos.Ejercicio.RuizFran_FranchPedro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private long id;

    private String nombre, apellido1, apellido2;
    private String telefono, email;

    @ManyToOne
    private Direccion direccion;

    @ManyToOne
    private Curso curso;




}
