package com.salesianos.Ejercicio.RuizFran_FranchPedro.dto;

import com.salesianos.Ejercicio.RuizFran_FranchPedro.model.Categoria;
import com.salesianos.Ejercicio.RuizFran_FranchPedro.model.Producto;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GetProductoDto {

    private long id;

    private String nombre;
    private double pvp;
    private String img;
    private String categoria;

    public static GetProductoDto of(Producto producto){
        return GetProductoDto.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .pvp(producto.getPvp())
                .img(producto.getImg().get(0))
                .categoria(producto.getCategory().getNombre())
                .build();
    }
}
