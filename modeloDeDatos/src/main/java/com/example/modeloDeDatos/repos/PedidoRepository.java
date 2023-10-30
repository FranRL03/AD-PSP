package com.example.modeloDeDatos.repos;

import com.example.modeloDeDatos.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}