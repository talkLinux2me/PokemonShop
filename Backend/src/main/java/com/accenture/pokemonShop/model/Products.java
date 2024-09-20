package com.accenture.pokemonShop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "cardname", nullable = false, length = 50)
    private String cardname;

    @Column(name = "packtype", nullable = false, length = 50)
    private String packtype;

    @Column(name = "imageurl", nullable = false, length = 50)
    private String imageurl;

    @Column(name = "price", nullable = false)
    private Double price;

}