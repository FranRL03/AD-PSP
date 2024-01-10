package org.example;

import org.junit.jupiter.api.*;

public class TestTest {

    @BeforeAll
    static void initAll(){
        System.out.println("Al principio de todo");
    }

    @BeforeEach
     void init() {
        System.out.println("Antes de cada test");
    }

    @Test
    void test() {
        System.out.println("test");
        Assertions.assertTrue(true);
    }
    @Test
    @Disabled("este tests no se ejecuta")
    void skippedTest() {
    }
    @AfterEach
    void tearDown() {
        System.out.println("Después de cada test");
    }
    @AfterAll
    static void tearDownAll() {
        System.out.println("Al final de todo");
    }
}
