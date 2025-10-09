package com.thuysaluvison.AtividadeSistemasDistribuidos.services;

import com.thuysaluvison.AtividadeSistemasDistribuidos.dtos.ProductRequestDTO;
import com.thuysaluvison.AtividadeSistemasDistribuidos.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void create() {
        ProductRequestDTO productRequestDTO = new ProductRequestDTO("Produto teste", 123, 199f, 13);

    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }
}