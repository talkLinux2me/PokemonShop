package com.accenture.pokemonShop.controller;


import com.accenture.pokemonShop.model.Products;
import com.accenture.pokemonShop.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService) {
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
