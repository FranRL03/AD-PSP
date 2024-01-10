package com.salesianostriana.dam.rest.dto.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record EditRutaDto(

        @NotEmpty(message = "{editRutaDto.nombre.notempty}")
        String nombre,
        @Min(value=1, message = "El valor tiene que ser mayor a 0")
        int duracion,
        String dificultad,
        List<Long> monumentos) {


}
