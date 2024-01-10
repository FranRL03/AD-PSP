package org.example;

public class Triangulo {

    public String tipoTriangulo(int a, int b, int c){

            if (a == b && b == c) {
                return "Equilátero";
            } else if (a == b || a == c || b == c) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
    }

}
