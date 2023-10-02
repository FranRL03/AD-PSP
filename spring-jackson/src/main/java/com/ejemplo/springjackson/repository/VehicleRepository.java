package com.ejemplo.springjackson.repository;

import com.ejemplo.springjackson.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
