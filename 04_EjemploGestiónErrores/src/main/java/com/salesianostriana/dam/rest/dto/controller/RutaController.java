package com.salesianostriana.dam.rest.dto.controller;

import com.salesianostriana.dam.rest.dto.dto.EditRutaDto;
import com.salesianostriana.dam.rest.dto.dto.GetRutaDto;
import com.salesianostriana.dam.rest.dto.errors.RutaNotFoundException;
import com.salesianostriana.dam.rest.dto.model.entities.Ruta;
import com.salesianostriana.dam.rest.dto.model.repos.RutaRepository;
import com.salesianostriana.dam.rest.dto.service.RutaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ruta")
@RequiredArgsConstructor
public class RutaController {

    private final RutaRepository rutaRepository;

    private final RutaService rutaService;

    @GetMapping("/")
    public ResponseEntity<List<GetRutaDto>> todas() {

        List<Ruta> rutas = rutaRepository.findAll();

        if (rutas.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(
                rutas.stream()
                        .map(GetRutaDto::of)
                        .toList()
        );

    }

    @GetMapping("/{id}")
    public Ruta findById(@PathVariable Long id) {

//        return ResponseEntity.of(rutaService.findById(id));
        return rutaService.findById(id);

    }

    @PostMapping("/")
    public ResponseEntity<GetRutaDto> nuevaRuta(
            @Valid @RequestBody EditRutaDto nuevo) {

        Ruta ruta = rutaService.save(nuevo);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(GetRutaDto.of(ruta));

    }

}
