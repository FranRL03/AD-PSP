package com.example.ejercicio_2_clase.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class VideoPk implements Serializable {

    private CursoOnline cursoOnline;
    private Long id;

    private VideoPk (){

    }
}
