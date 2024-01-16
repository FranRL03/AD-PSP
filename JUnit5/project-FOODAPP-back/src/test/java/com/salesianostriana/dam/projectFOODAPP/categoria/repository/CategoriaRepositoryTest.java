package com.salesianostriana.dam.projectFOODAPP.categoria.repository;

import com.salesianostriana.dam.projectFOODAPP.categoria.model.Categoria;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CategoriaRepositoryTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Test
    void buscarCategoriaPorNombre() {

        Categoria c1 = Categoria.builder()
                .nombre("Tapeo")
                .build();

        Categoria c2 = Categoria.builder()
                .nombre("Comida")
                .build();


        /*
        Utilizar esta estrategia para las consultas UPDATE
         */
//        entityManager.merge(c1);
//        entityManager.persist(c2);

        /*
        Utilizar esta estrategia para las consultas SELECT
         */
        categoriaRepository.saveAll(List.of(c1, c2));

        Optional<Categoria> categorias = categoriaRepository.buscarCategoriaPorNombre("Tapeo");

        assertEquals(categorias.get(), categorias.get());

    }
}