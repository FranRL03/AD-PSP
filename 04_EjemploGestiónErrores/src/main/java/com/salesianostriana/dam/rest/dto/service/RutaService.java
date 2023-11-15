package com.salesianostriana.dam.rest.dto.service;

import com.salesianostriana.dam.rest.dto.dto.EditRutaDto;
import com.salesianostriana.dam.rest.dto.errors.RutaNotFoundException;
import com.salesianostriana.dam.rest.dto.model.entities.Dificultad;
import com.salesianostriana.dam.rest.dto.model.entities.Monumento;
import com.salesianostriana.dam.rest.dto.model.entities.Ruta;
import com.salesianostriana.dam.rest.dto.model.repos.MonumentoRepository;
import com.salesianostriana.dam.rest.dto.model.repos.RutaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RutaService {

    private final RutaRepository repository;

    // Inyectamos el repositorio mientras no tengamos servicio
    private final MonumentoRepository monumentoRepository;

    public Ruta save(EditRutaDto nuevo) {

        Ruta r = new Ruta();
        r.setNombre(nuevo.nombre());
        r.setTiempo(nuevo.duracion());
        r.setDificultad(Dificultad.valueOf(nuevo.dificultad()));

        // Supongamos que todo va bien
        /*List<Monumento> monumentos = nuevo.monumentos()
                .stream()
                .map(monumentoRepository::getReferenceById) // Vlad Mihalcea
                .toList();
        */
        List<Monumento> monumentos = new ArrayList<>();

        for(Long id : nuevo.monumentos()) {
            Monumento m = monumentoRepository.getReferenceById(id);
            monumentos.add(m);
        }


        r.setMonumentos(monumentos);


        return repository.save(r);
    }

    public Ruta findById(Long id){

//        Optional<Ruta> encontrado = Optional.of(repository.getReferenceById(id));

        return repository.findById(id)
                .orElseThrow(() -> new RutaNotFoundException(id));

    }

}
