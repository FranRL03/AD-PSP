package com.salesianostriana.dam.ejercicio_monumentos.monumentos;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ControllerMonumento {

    private final MonumentoRepositorio monumentoRepositorio;

    @GetMapping("/monumento/")
    public ResponseEntity<List<Monumento>> mostrarTodos(){

        List<Monumento> mon = monumentoRepositorio.findAll();

        if(mon.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(mon);
    }

    @GetMapping("/monumento/{id}")
    public ResponseEntity<Monumento> mostrarPorId(@PathVariable long id){
        return ResponseEntity.of(monumentoRepositorio.findById(id));
    }

    @PostMapping("/monumento/")
    public ResponseEntity<Monumento> añadir(@RequestBody Monumento monumento){

        Monumento mon = monumentoRepositorio.save(monumento);

        return ResponseEntity.status(201).body(mon);
    }

    @PutMapping("/monumento/{id}")
    public ResponseEntity<Monumento> editar (@PathVariable long id,
                                             @RequestBody Monumento monumento){
        return ResponseEntity.of(monumentoRepositorio.findById(id)
                .map(mon -> {
                    mon.setCodigo(mon.getCodigo());
                    mon.setNombrePais(mon.getNombrePais());
                    mon.setNombreCiudad(mon.getNombreCiudad());
                    mon.setLongitud(mon.getLongitud());
                    mon.setLatitud(mon.getLatitud());
                    mon.setNombreMonumento(mon.getNombreMonumento());
                    mon.setDescripcion(mon.getDescripcion());
                    mon.setUrl(mon.getUrl());
                    return monumentoRepositorio.save(mon);
                }));
    }

}
