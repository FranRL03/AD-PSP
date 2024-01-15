package com.salesianostriana.dam.projectFOODAPP.categoria.service;

import com.salesianostriana.dam.projectFOODAPP.categoria.dto.GetCategoriaProductsDto;
import com.salesianostriana.dam.projectFOODAPP.categoria.repository.CategoriaRepository;
import com.salesianostriana.dam.projectFOODAPP.producto.dto.GetDtoProducto;
import com.salesianostriana.dam.projectFOODAPP.producto.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        List<GetCategoriaProductsDto> expectResult = List.of(new GetCategoriaProductsDto(
                "Bebida",
                "Zumo",
                ))
        ));
    }

    @Test
    void deleteCategoria() {
    }
}