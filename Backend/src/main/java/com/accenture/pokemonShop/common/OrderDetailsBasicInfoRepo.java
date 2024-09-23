package com.accenture.pokemonShop.common;

import com.accenture.pokemonShop.model.OrderDetailsBasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsBasicInfoRepo extends JpaRepository<OrderDetailsBasicInfo, Integer> {

    List<OrderDetailsBasicInfo> findByOrderId (Integer orderId);



}
