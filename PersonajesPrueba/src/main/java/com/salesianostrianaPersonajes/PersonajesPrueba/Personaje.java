package com.salesianostrianaPersonajes.PersonajesPrueba;

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
public class Personaje {

    @Id
    @GeneratedValue
    private long id;

    private String name, roll, linea;
    private double hp, damage;
}
