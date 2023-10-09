package com.salesianostriana.dam.rest.dto.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.salesianostriana.dam.rest.dto.model.View.MonumentoView;
import com.salesianostriana.dam.rest.dto.model.View.RutaView;
import com.salesianostriana.dam.rest.dto.model.entities.Monumento;
import com.salesianostriana.dam.rest.dto.model.entities.Ruta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static com.salesianostriana.dam.rest.dto.model.View.MonumentoView.*;

@RestController
@RequestMapping("/monumento")
public class MonumentoController {

    List<Monumento> monumentos;

    public MonumentoController (){
        this.monumentos = List.of(
                new Monumento(1L, "CódigoPais1", "Pais1", "Ciudad1", "Loc1", "Nombre1", "Descripción1", Arrays.asList("imagen1.jpg", "imagen2.jpg")),
                new Monumento(2L, "CódigoPais2", "Pais2", "Ciudad2", "Loc2", "Nombre2", "Descripción2", Arrays.asList("imagen3.jpg", "imagen4.jpg"))
        );
    }

    @GetMapping("/")
    @JsonView(MonumentoView.MonumentoDetail.class)
    public List<Monumento> findAll() {
        return monumentos;
    }

    @GetMapping("/{id}")
    @JsonView(MonumentoDetail.class)
    public Monumento findById(@PathVariable Long id){
        return monumentos.stream()
                .filter(monumento -> monumento.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


}
