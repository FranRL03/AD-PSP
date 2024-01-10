package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    @DisplayName("Suma de números")
    void sumarDosNumeros(){
        Calculadora c = new Calculadora();
        int esperado = 2;
        Assertions.assertEquals(esperado, c.sumar(1, 1));

    }
}
