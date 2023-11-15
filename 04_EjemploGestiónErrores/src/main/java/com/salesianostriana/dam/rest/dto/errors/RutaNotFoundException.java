package com.salesianostriana.dam.rest.dto.errors;

public class RutaNotFoundException extends RuntimeException{

    public RutaNotFoundException (Long id){
        super("Ruta with id: "+ id+ "not found");
    }
}
