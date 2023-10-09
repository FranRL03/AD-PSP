package com.salesianostriana.dam.rest.dto.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.salesianostriana.dam.rest.dto.model.entities.Dificultad;
import com.salesianostriana.dam.rest.dto.model.entities.Monumento;
import com.salesianostriana.dam.rest.dto.model.entities.Ruta;
import org.springframework.web.bind.annotation.*;

import static com.salesianostriana.dam.rest.dto.model.View.RutaView.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ruta")
public class RutaController {

    private List<Ruta> rutas;

    public RutaController(MonumentoController monumentoController){

        List<Monumento> monumentos = monumentoController.findAll();

        this.rutas = List.of(
                new Ruta(1L, "Ruta Cofrade", 120, Dificultad.BAJA, monumentos),
                new Ruta(2L, "Ruta", 120, Dificultad.BAJA, monumentos)
        );
    }

    @GetMapping("/")
    @JsonView(RutaDetail.class)
    public List<Ruta> findAll() {
        return rutas;
    }


    @GetMapping("/{id}")
    @JsonView(RutaDetail.class)
    public Ruta findById(@PathVariable Long id) {
        return rutas.stream()
                .filter(rutas -> rutas.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
