package com.example.modeloDeDatos;

import com.example.modeloDeDatos.models.Categoria;
import com.example.modeloDeDatos.models.LineaDePedido;
import com.example.modeloDeDatos.models.Pedido;
import com.example.modeloDeDatos.models.Producto;
import com.example.modeloDeDatos.repos.CategoriaRepository;
import com.example.modeloDeDatos.repos.PedidoRepository;
import com.example.modeloDeDatos.repos.ProductoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitData {

    private final CategoriaRepository categoriaRepository;
    private final ProductoRepository productoRepository;
    private final PedidoRepository pedidoRepository;

    @PostConstruct
    public void init(){

        Producto p1 = Producto.builder()
                .nombre("Patatas")
                .imagen("htttpppef")
                .descripcion("patatas caseras")
                .precio(1.5)
                .precioOferta(0.5)
                .tags("Caseras")
                .build();

        productoRepository.save(p1);

        Categoria c1 = Categoria.builder()
                .nombre("Comida")
                .productoes(List.of(p1))
                .build();

        categoriaRepository.save(c1);

        p1.setCategoria(c1);
        productoRepository.save(p1);

        Pedido pedido1 = Pedido.builder()
                .fecha(LocalDateTime.now())
                .build();

        pedidoRepository.save(pedido1);

        LineaDePedido l1 = LineaDePedido.builder()
                .precioUnitario(1.5)
                .cantidad(2)
                .producto(p1)
                .build();

        l1.addToPedido(pedido1);

        System.out.println(p1);
        System.out.println(c1);
        System.out.println(l1);
        System.out.println(pedido1);


    }


}
