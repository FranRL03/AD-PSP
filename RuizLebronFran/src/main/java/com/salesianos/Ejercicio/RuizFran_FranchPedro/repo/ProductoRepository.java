package com.salesianos.Ejercicio.RuizFran_FranchPedro.repo;

import com.salesianos.Ejercicio.RuizFran_FranchPedro.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
