package com.example.BaseDeDatos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Entidad {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
