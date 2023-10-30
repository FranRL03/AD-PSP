package com.example.modeloDeDatos.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @ToString.Exclude
    @OneToMany(mappedBy = "pedido", orphanRemoval = true)
    @Builder.Default
    private List<LineaDePedido> lineaDePedidoes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
