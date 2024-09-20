package com.accenture.pokemonShop.config;


import com.accenture.pokemonShop.common.OrderDetailsBasicInfoRepo;
import com.accenture.pokemonShop.model.OrderDetailsBasicInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class RunJsonDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(RunJsonDataLoader.class);
    private final OrderDetailsBasicInfoRepo orderDetailsBasicInfoRepo;
    final ObjectMapper objectMapper;

    public RunJsonDataLoader(OrderDetailsBasicInfoRepo orderDetailsBasicInfoRepo, ObjectMapper objectMapper){
        this.orderDetailsBasicInfoRepo = orderDetailsBasicInfoRepo;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String ...args) throws Exception{

        if(orderDetailsBasicInfoRepo.count() == 0){
            try(InputStream inputStream = getClass().getResourceAsStream("/data/basicOrderInfo.json")){
                List<OrderDetailsBasicInfo> orderDetailsBasicInfos = objectMapper.readValue(inputStream, new TypeReference<List<OrderDetailsBasicInfo>>() {});
                    logger.info("orderDetailsBasicInfos loaded from JSON file: {}", orderDetailsBasicInfos);
                    orderDetailsBasicInfoRepo.saveAll(orderDetailsBasicInfos);

            }catch (IOException e){
                throw new RuntimeException("Unable to load data from JSON file", e);
            }
        } else {
            logger.info("Data already loaded");
        }
    }
}
