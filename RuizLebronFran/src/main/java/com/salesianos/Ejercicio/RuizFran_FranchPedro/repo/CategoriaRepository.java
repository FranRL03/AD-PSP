package com.salesianos.Ejercicio.RuizFran_FranchPedro.repo;


import com.salesianos.Ejercicio.RuizFran_FranchPedro.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
}