package com.salesianostriana.dam.ejemploapirest.errors;

public class AlumnoNotFoundException extends RuntimeException{

    public AlumnoNotFoundException (Long id){
        super("Alum with id: "+ id +" not found");
    }
}
