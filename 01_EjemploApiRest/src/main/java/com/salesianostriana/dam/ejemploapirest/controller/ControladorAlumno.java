package com.salesianostriana.dam.ejemploapirest.controller;

import com.salesianostriana.dam.ejemploapirest.models.Alumno;
import com.salesianostriana.dam.ejemploapirest.repo.AlumnoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ControladorAlumno {

    private final AlumnoRepositorio alumnoRepositorio;

    @GetMapping("/alumno/")
    public ResponseEntity <List<Alumno>> getAll(){
        List<Alumno> result = alumnoRepositorio.findAll();

        if(result.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<Alumno> getById(@PathVariable long id){
        return ResponseEntity.of(alumnoRepositorio.findById(id));

        //El of te es un atajo al optional que te devuelve 200 si esta bien
        //o te devuelve 404 si no se ha encontrado
    }

    @PostMapping("/alumno/")
    public ResponseEntity<Alumno> create( @RequestBody Alumno alumno){
        Alumno nuevo = alumnoRepositorio.save(alumno);
        //return ResponseEntity.created(null).body(nuevo);
        return ResponseEntity.status(201).body(nuevo);
    }

    @PutMapping("/alumno/{id}")
    public ResponseEntity<Alumno> edit(@PathVariable long id, @RequestBody Alumno alumno){

        return ResponseEntity.of(alumnoRepositorio.findById(id)
                .map(antiguo -> {
                    antiguo.setNombre((alumno.getNombre()));
                    antiguo.setApellidos(alumno.getApellidos());
                    antiguo.setEdad(alumno.getEdad());
                    antiguo.setEmail(alumno.getEmail());
                    return alumnoRepositorio.save(antiguo);
                }));

    }

    @DeleteMapping("/alumno/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        if(alumnoRepositorio.existsById(id))
            alumnoRepositorio.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
