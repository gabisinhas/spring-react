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
    private Integer price;

    public Food(FoodResquestDTO data){
        this.price = data.price();
        this.title = data.title();

    }

//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
}
