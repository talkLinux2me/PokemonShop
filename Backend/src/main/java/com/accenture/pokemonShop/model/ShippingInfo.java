package com.accenture.pokemonShop.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "PokemonShop")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shippingAddress;
    private Double shippingCost;
    private LocalDate shippingDate;
    private LocalDate deliveryDate;
    private String trackingNumber;
    private String shippingStatus;
}
