package com.accenture.pokemonShop.controller;

import com.accenture.pokemonShop.common.OrderDetailsBasicInfoRepo;
import com.accenture.pokemonShop.model.OrderDetailsBasicInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderDetailsBasicInfoController {

    private final OrderDetailsBasicInfoRepo orderDetailsBasicInfoRepo;

    public OrderDetailsBasicInfoController(OrderDetailsBasicInfoRepo orderDetailsBasicInfoRepo){
        this.orderDetailsBasicInfoRepo = orderDetailsBasicInfoRepo;
    }

    @GetMapping("/Orderdetails")
    public ResponseEntity<List<OrderDetailsBasicInfo>> Orderdetails(){
        List<OrderDetailsBasicInfo> orderDetailsBasicInfos = orderDetailsBasicInfoRepo.findAll();
        return ResponseEntity.ok(orderDetailsBasicInfos);
    }



}
