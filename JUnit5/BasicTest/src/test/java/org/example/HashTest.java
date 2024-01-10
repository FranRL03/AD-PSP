package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HashTest {

    HashSet<Integer> hs;
    List<Integer> c;

    /* Antes de cada test se ejecuta este para instanciar las varias en cada test */
    @BeforeEach
    void setUp(){
        hs = new HashSet<>();
        c = new ArrayList<>();
    }

    @AfterEach
    void tearDown(){
        hs = null;
        c = null;
    }

    @Test
    void hashSetSizeLessThanCollectionSize(){
        hs.addAll(List.of(1,2,3,4));
        c.addAll(List.of(1,2,3,5,6));

        boolean actual = hs.removeAll(c);

//        Assertions.assertTrue(actual);
//        Assertions.assertEquals(1, hs.size());
//        Assertions.assertTrue(hs.contains(4));

        /* comprueba todos a la vez,  este tiene que dar dos fallos */
        Assertions.assertAll("hashset",
                () -> Assertions.assertTrue(hs.contains(5)),
                () -> Assertions.assertFalse(actual),
                () ->  assertEquals(1, hs.size())

        );
    }

    @ParameterizedTest
    @MethodSource("generateCollectionsWithElements")
    void testWhenBothCollectionsHasSizeGreaterThan0(List<Integer> hs, List<Integer> c, boolean expectedResult, int sizeResult){

        hs.addAll(hs);

        assertEquals(expectedResult, hs.removeAll(c));
        assertEquals(sizeResult, hs.size());
    }

    static Stream<Arguments> generateCollectionsWithElements(){
        return Stream.of(
                arguments(List.of(1,2,3,4)), arguments(List.of(1,2,3,5,6), true, 1),
                arguments(List.of(1,2,3,5,6)), arguments(List.of(1,2,3,4), true, 2),
                arguments(List.of()), arguments(List.of(1), false, 0)

        );
    }

    /* comprobacion de que se lanza una excepcion */
    @Test
    void WhenCollectionsIsNull(){
        c = null;

        hs.addAll(List.of(1,2,3));

        Assertions.assertThrows(NullPointerException.class, () -> {
            hs.removeAll(c);
        });
    }
}
