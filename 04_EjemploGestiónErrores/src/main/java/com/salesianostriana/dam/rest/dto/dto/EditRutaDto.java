package com.salesianostriana.dam.rest.dto.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record EditRutaDto(

        @NotEmpty(message = "Nombre vacío")
        String nombre,
        @Min(1)
        int duracion,
        String dificultad,
        List<Long> monumentos) {


}
