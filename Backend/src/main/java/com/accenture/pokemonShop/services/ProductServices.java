package com.accenture.pokemonShop.services;

import com.accenture.pokemonShop.model.Products;
import com.accenture.pokemonShop.model.PokemonApiResponse;
import com.accenture.pokemonShop.model.Type;
import com.accenture.pokemonShop.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ProductServices {
    private final ProductRepository productRepository;
    private final RestTemplate restTemplate;
    private final Logger logger = LoggerFactory.getLogger(ProductServices.class);
    private final Random random = new Random();

    public ProductServices(ProductRepository productRepository, RestTemplate restTemplate) {
        this.productRepository = productRepository;
        this.restTemplate = restTemplate;
    }

    public void populateProducts() {
        logger.info("Inside populateProducts method");
        String apiUrl = "https://api.pokemontcg.io/v2/cards";
        logger.info("Fetching data from API: {}", apiUrl);
        PokemonApiResponse response = restTemplate.getForObject(apiUrl, PokemonApiResponse.class);
        logger.info("API response: {}", response);

        if (response != null && response.getData() != null) {
            logger.info("API response received with {} cards", response.getData().size());
            List<Products> products = response.getData().stream()
                    .map(card -> {
                        String typeString = card.getType();
                        Type type = typeString != null ? Type.valueOf(typeString.toUpperCase()) : null;
                        Double price = card.getCardmarket() != null && card.getCardmarket().getPrices() != null
                                ? (card.getCardmarket().getPrices().getMid() != null ? card.getCardmarket().getPrices().getMid() : 0.0)
                                : 0.0; // Assign 0 if price is null
                        return new Products(
                                null,
                                type,
                                card.getName(),
                                card.getSet().getName(),
                                card.getSet().getImages().getSymbol(),
                                price
                        );
                    })
                    .collect(Collectors.toList());

            logger.info("Saving {} products to the database", products.size());
            productRepository.saveAll(products);
            logger.info("Products saved successfully");
        } else {
            logger.warn("No data received from API or response is null");
        }
    }
}