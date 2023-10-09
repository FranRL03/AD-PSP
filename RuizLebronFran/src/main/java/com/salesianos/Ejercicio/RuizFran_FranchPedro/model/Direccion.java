package com.salesianos.Ejercicio.RuizFran_FranchPedro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    @Id
    @GeneratedValue
    private long id;

    private String tipoVia, linea1, linea2;
    private int cp, poblacion;
    private String provincia;


}
