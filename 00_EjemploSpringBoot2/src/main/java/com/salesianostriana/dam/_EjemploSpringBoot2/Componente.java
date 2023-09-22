package com.salesianostriana.dam._EjemploSpringBoot2;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Componente {

    public void print(){
        System.out.println("Hola componente");
    }
}
