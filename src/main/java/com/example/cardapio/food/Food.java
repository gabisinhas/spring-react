package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="food")
@Entity(name="food")

// @Getter gera automaticamente uma classe de getter para cada variavel criada.
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    private Double price;
    private String image;

    public Food(FoodRequestDTO data){
        this.price = data.price();
        this.title = data.title();
        this.image = data.image();

    }
}
