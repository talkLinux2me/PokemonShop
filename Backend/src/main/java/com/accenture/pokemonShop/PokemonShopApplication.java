package com.accenture.pokemonShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.accenture.pokemonShop"})
public class PokemonShopApplication {

	public static void main(String[] args) {

		SpringApplication.run(PokemonShopApplication.class, args);
	}

}
