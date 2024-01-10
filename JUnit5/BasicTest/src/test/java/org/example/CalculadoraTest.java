package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Stream;

public class CalculadoraTest {

    @Test
    @DisplayName("Suma de números")
    void sumarDosNumeros(){
        Calculadora c = new Calculadora();
        int esperado = 2;
        Assertions.assertEquals(esperado, c.sumar(1, 1));

    }

    @ParameterizedTest
    /* la cantidad de valores que metamos son las veces
    que se va a repetir el test, en este caso se repetirá 3 veces
     */
    @CsvSource({
            "1,1,2",
            "0,1,1",
            "1,2,4"
    })
    void sumarDosNumerosParametrizados(int a, int b, int resultado){
        Calculadora c = new Calculadora();

        Assertions.assertEquals(resultado, c.sumar(a, b));
    }

}
