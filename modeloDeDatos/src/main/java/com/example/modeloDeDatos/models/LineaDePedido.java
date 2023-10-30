package com.example.modeloDeDatos.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class LineaDePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long codLinea;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public void addToPedido(Pedido p){
        this.pedido = p;
        p.getLineaDePedidoes().add(this);
    }

    public void deleteFromPedido(Pedido p){
        p.getLineaDePedidoes().remove(this);
        this.pedido = null;
    }

}
