package com.salesianostriana.dam._EjemploSpringBoot2;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Servicio {

    private final Componente componente;
    private final Componente2 componente2;

    public void run (){
        componente.print();
        componente2.print();
    }

}
