package com.salesianostriana.dam.ejemploapirest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
