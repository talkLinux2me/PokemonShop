package com.accenture.pokemonShop.controller;

import com.accenture.pokemonShop.model.ShippingInfo;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.accenture.pokemonShop.repository.ShippingInfoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/shipping")
public class ShippingInfoController {

    private final ShippingInfoRepository repository;

    public ShippingInfoController(ShippingInfoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ShippingInfo> getAllShippingInfo() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShippingInfo> getShippingInfoById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
//    @Secured("ROLE_ADMIN") // Only accessible by admin
    public ShippingInfo createShippingInfo(@RequestBody ShippingInfo shippingInfo) {
        return repository.save(shippingInfo);
    }

    @PutMapping("/{id}")
//    @Secured("ROLE_ADMIN") // Only accessible by admin
    public ResponseEntity<ShippingInfo> updateShippingInfo(
            @PathVariable Long id,
            @RequestBody ShippingInfo shippingInfoDetails) {
        return repository.findById(id)
                .map(shippingInfo -> {
                    shippingInfo.setShippingAddress(shippingInfoDetails.getShippingAddress());
                    shippingInfo.setShippingCost(shippingInfoDetails.getShippingCost());
                    shippingInfo.setShippingDate(shippingInfoDetails.getShippingDate());
                    shippingInfo.setDeliveryDate(shippingInfoDetails.getDeliveryDate());
                    shippingInfo.setTrackingNumber(shippingInfoDetails.getTrackingNumber());
                    shippingInfo.setShippingStatus(shippingInfoDetails.getShippingStatus());
                    return ResponseEntity.ok(repository.save(shippingInfo));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
//    @Secured("ROLE_ADMIN") // Only accessible by admin
    public ResponseEntity<Object> deleteShippingInfo(@PathVariable Long id) {
        return repository.findById(id)
                .map(shippingInfo -> {
                    repository.delete(shippingInfo);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
