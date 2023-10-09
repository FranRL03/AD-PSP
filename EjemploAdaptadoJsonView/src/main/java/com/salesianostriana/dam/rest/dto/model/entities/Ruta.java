package com.salesianostriana.dam.rest.dto.model.entities;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.salesianostriana.dam.rest.dto.model.View.RutaView.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ruta {

    @JsonView({RutaList.class})
    @Id @GeneratedValue
    private Long id;

    @JsonView({RutaList.class})
    private String nombre;

    @JsonView({RutaDetail.class})
    private int tiempo; // en minutos

    @Enumerated(EnumType.STRING)
    @JsonView({RutaDetail.class})
    private Dificultad dificultad;


    @ManyToMany
    @JsonView({RutaDetail.class})
    private List<Monumento> monumentos;

}
