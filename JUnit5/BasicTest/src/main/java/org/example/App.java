package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>(List.of(1,2,3));
        List<Integer> c = null;

        hs.removeAll(c);
    }
    
}
