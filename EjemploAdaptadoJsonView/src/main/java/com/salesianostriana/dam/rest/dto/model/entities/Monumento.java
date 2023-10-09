package com.salesianostriana.dam.rest.dto.model.entities;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.salesianostriana.dam.rest.dto.model.View.MonumentoView.*;

import java.util.List;

@Entity
@Data // Jpa Buddy
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Monumento {

    @Id @GeneratedValue
    @JsonView({MonumentoList.class})
    private Long id;

    @JsonView({MonumentoDetail.class})
    private String codigoPais;

    @JsonView({MonumentoDetail.class})
    private String pais, ciudad;

    @JsonView({MonumentoDetail.class})
    private String loc;

    @JsonView({MonumentoList.class})
    private String nombre;

    @JsonView({MonumentoDetail.class})
    private String descripcion;

    @ElementCollection // Obligatoria en Spring Boot 2.
    @JsonView({MonumentoDetail.class})
    private List<String> imagenes;


}
