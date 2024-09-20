package com.accenture.pokemonShop.controller;


import com.accenture.pokemonShop.model.Products;
import com.accenture.pokemonShop.repository.ProductRepository;
import com.accenture.pokemonShop.services.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductServices productService;

    public ProductController(ProductRepository productRepository, ProductServices productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }

    //Get all products
    @GetMapping("/products")
    public List<Products> getProducts() {
        return productRepository.findAll();

    }
    @PostMapping("/populate-products")
    public void populateProducts() {
        productService.populateProducts();
    }
}
