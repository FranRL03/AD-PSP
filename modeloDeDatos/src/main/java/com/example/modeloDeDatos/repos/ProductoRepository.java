package com.example.modeloDeDatos.repos;

import com.example.modeloDeDatos.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}