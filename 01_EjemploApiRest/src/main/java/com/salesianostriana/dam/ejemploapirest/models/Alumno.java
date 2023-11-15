package com.salesianostriana.dam.ejemploapirest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alumno {

    @Id
    @GeneratedValue
    private long id;

    private String nombre, apellidos, email;
    private int edad;

}
