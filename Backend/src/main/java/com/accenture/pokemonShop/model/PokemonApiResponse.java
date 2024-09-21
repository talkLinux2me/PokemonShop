package com.accenture.pokemonShop.model;

import java.util.List;

public class PokemonApiResponse {
    private List<Card> data;

    public List<Card> getData() {
        return data;
    }

    public void setData(List<Card> data) {
        this.data = data;
    }

    public static class Card {
        private String name;
        private String type;
        private Set set;
        private Cardmarket cardmarket;

        // Getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Set getSet() {
            return set;
        }

        public void setSet(Set set) {
            this.set = set;
        }

        public Cardmarket getCardmarket() {
            return cardmarket;
        }

        public void setCardmarket(Cardmarket cardmarket) {
            this.cardmarket = cardmarket;
        }
    }

    public static class Set {
        private String name;
        private Images images;

        // Getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Images getImages() {
            return images;
        }

        public void setImages(Images images) {
            this.images = images;
        }
    }

    public static class Images {
        private String symbol;

        // Getters and setters

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    }

    public static class Cardmarket {
        private Prices prices;

        // Getters and setters

        public Prices getPrices() {
            return prices;
        }

        public void setPrices(Prices prices) {
            this.prices = prices;
        }
    }

    public static class Prices {
        private Double mid;

        // Getters and setters

        public Double getMid() {
            return mid;
        }

        public void setMid(Double mid) {
            this.mid = mid;
        }
    }
}