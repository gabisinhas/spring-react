package com.example.cardapio.food;

public record FoodResponseDTO (Long id, String title, Double price, String image){
    public FoodResponseDTO(Food food){
        this(food.getId(),food.getTitle(),food.getPrice(), food.getImage());
    }
}
