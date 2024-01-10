package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class AppTest {

    @Test

    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void test1(){
        HashSet<Integer> hs = new HashSet<>(List.of(1,2,3,4,5));
        Collection<Integer> c = Collections.emptyList();

        /* el assert comprueba como si fuera un if */
        assertFalse(hs.removeAll(c));

//        assertTrue(hs.removeAll(c));
    }

}
