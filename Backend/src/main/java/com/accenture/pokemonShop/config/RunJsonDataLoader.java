package com.accenture.pokemonShop.config;



import com.accenture.pokemonShop.common.OrderDetailsBasicInfoRepo;
import com.accenture.pokemonShop.model.OrderDetailsBasicInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.accenture.pokemonShop.model.ShippingInfo;
import com.accenture.pokemonShop.repository.ShippingInfoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@Configuration
public class RunJsonDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(RunJsonDataLoader.class);
    private final OrderDetailsBasicInfoRepo orderDetailsBasicInfoRepo;
    final ObjectMapper objectMapper;
    private final ShippingInfoRepository shippingInfoRepository;

    public RunJsonDataLoader(OrderDetailsBasicInfoRepo orderDetailsBasicInfoRepo, ObjectMapper objectMapper, ShippingInfoRepository shippingInfoRepository) {
        this.orderDetailsBasicInfoRepo = orderDetailsBasicInfoRepo;
        this.objectMapper = objectMapper;
        this.shippingInfoRepository = shippingInfoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (shippingInfoRepository.count() == 0) {
            try (InputStream inputStream = getClass().getResourceAsStream("/data/shipping.json")) {
                List<ShippingInfo> shippinginfo = objectMapper.readValue(inputStream, new TypeReference<List<ShippingInfo>>() {
                });
                logger.info("ShippingInfo loaded from JSON file: {}", shippinginfo);
                shippingInfoRepository.saveAll(shippinginfo);
            } catch (IOException e) {
                throw new RuntimeException("Unable to load data from JSON file", e);
            }
        } else {
            logger.info(("Data already loaded"));
        }

        if (orderDetailsBasicInfoRepo.count() == 0) {
            try (InputStream inputStream = getClass().getResourceAsStream("/data/basicOrderInfo.json")) {
                List<OrderDetailsBasicInfo> orderDetailsBasicInfos = objectMapper.readValue(inputStream, new TypeReference<List<OrderDetailsBasicInfo>>() {
                });
                logger.info("orderDetailsBasicInfos loaded from JSON file: {}", orderDetailsBasicInfos);
                orderDetailsBasicInfoRepo.saveAll(orderDetailsBasicInfos);

            } catch (IOException e) {
                throw new RuntimeException("Unable to load data from JSON file", e);
            }
        } else {
            logger.info("Data already loaded");
        }
    }
}


