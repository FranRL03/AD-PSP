package com.salesianostriana.dam.ejercicio_monumentos.monumentos;

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
public class Monumento {

    @Id
    @GeneratedValue
    private long id;

    private String codigo, nombrePais, nombreCiudad;
    private Double longitud, latitud;
    private String nombreMonumento, descripcion, url;

}
