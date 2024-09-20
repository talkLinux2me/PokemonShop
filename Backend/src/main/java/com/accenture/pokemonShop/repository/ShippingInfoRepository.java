package com.accenture.pokemonShop.repository;

import com.accenture.pokemonShop.model.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShippingInfoRepository extends JpaRepository<ShippingInfo, Long> {
    List<ShippingInfo> findByDate(String date);
}