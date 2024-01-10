package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    Triangulo t;

    @BeforeEach
    void setUp(){
        t = new Triangulo();
    }


    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, Escaleno",
            "2, 2, 2, Equilátero",
            "3, 3, 4, Isósceles"
    })
    void clasificarTriangulo(int a, int b, int c, String clasificacionEsperada) {
        String resultado = t.tipoTriangulo(a, b, c);
        assertEquals(clasificacionEsperada, resultado);
    }
}
