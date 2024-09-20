package com.accenture.pokemonShop.repository;

import com.accenture.pokemonShop.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
    // Additional query methods can be defined here
}