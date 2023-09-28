package com.salesianostrianaPersonajes.PersonajesPrueba;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonajeController {

    private final PersonajeRepositorio personajeRepositorio;

    @GetMapping("/personaje/")
    public ResponseEntity <List<Personaje>> show (){
        List<Personaje> result = personajeRepositorio.findAll();

        if(result.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/personaje/{id}")
    public ResponseEntity <Personaje> findById (@PathVariable long id){

        return ResponseEntity.of(personajeRepositorio.findById(id));
    }

    @PostMapping("/personaje/")
    public ResponseEntity<Personaje> create (@RequestBody Personaje p){

        Personaje nuevo = personajeRepositorio.save(p);

        return ResponseEntity.status(201).body(nuevo);
    }

    @PutMapping("/personaje/{id}")
    public ResponseEntity<Personaje> edit (@RequestBody Personaje p,
                                           @PathVariable long id){
        return ResponseEntity.of(personajeRepositorio.findById(id)
                .map(aEditar -> {
                    aEditar.setName(aEditar.getName());
                    aEditar.setRoll(aEditar.getRoll());
                    aEditar.setLinea(aEditar.getLinea());
                    aEditar.setHp(aEditar.getHp());
                    aEditar.setDamage(aEditar.getDamage());
                    return personajeRepositorio.save(aEditar);
                }));
    }

    @DeleteMapping("/personaje/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){

        if (personajeRepositorio.existsById(id))
            personajeRepositorio.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
