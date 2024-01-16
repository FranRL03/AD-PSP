package com.salesianostriana.dam.projectFOODAPP.categoria.service;

import com.salesianostriana.dam.projectFOODAPP.categoria.dto.GetCategoriaProductsDto;
import com.salesianostriana.dam.projectFOODAPP.categoria.model.Categoria;
import com.salesianostriana.dam.projectFOODAPP.categoria.repository.CategoriaRepository;
import com.salesianostriana.dam.projectFOODAPP.producto.dto.GetDtoProducto;
import com.salesianostriana.dam.projectFOODAPP.producto.model.Producto;
import com.salesianostriana.dam.projectFOODAPP.producto.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoriaServiceTest {

    @Mock
    CategoriaRepository categoriaRepository;
    @Mock
    ProductoRepository productoRepository;

    @InjectMocks
    CategoriaService categoriaService;


    @Test
    void categoryWithProductsV2() {

        UUID categoriaId = UUID.randomUUID();
        UUID productoId = UUID.randomUUID();
        String[] tags = {"Tag1", "Tag2"};

        Categoria categoria = new Categoria(categoriaId,"Bebida");
        Producto producto = new Producto(productoId, "Producto de prueba", "efref", "eferf", 9.99, 0,tags, categoria);

        //SE TRAE TODAS LAS CATEGORIAS
        when(categoriaRepository.findAll()).thenReturn(List.of(categoria));
        //SE TRAE TODOS LOS PRODUCTOS DE CADA CATEGORIA
        when(productoRepository.findByCategoriaId(any(UUID.class))).thenReturn(List.of(producto));

        List<GetCategoriaProductsDto> result = categoriaService.categoryWithProductsV2();

        //COMPROBAMOS QUE SOLO TRAIGA UNA CATEGORIA PORQUE SOLO HEMOS METIDO UNA
        assertEquals(1, result.size());
        //COMPROBAMOS QUE LA CATEGORIA SE LLAMA IGUAL A LA QUE HEMOS PEDIDO
        assertEquals("Bebida", result.get(0).nombre());
        //COMPROBAMOS QUE SOLO TRAIGA UN PRODUCTO PORQUE SOLO HEMOS METIDO UN0
        assertEquals(1, result.get(0).productos().size());
        //COMPROBAMOS QUE EL PRODUCTO SE LLAMA IGUAL AL QUE HEMOS PUESTO
        assertEquals("Producto de prueba", result.get(0).productos().get(0).nombre());
    }

}