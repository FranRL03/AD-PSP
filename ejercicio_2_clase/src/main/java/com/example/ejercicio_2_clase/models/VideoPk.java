package com.example.ejercicio_2_clase.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VideoPk {

    private CursoOnline cursoOnline;
    private Long id;

    private VideoPk (){

    }
}
