package com.devolveric.dslistv2.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "fruits")
public class Fruit {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantity;
    private String taste;
    private String color;
    private String type;

    public Fruit() {
    }

    public Fruit(Long id, String name, Integer quantity, String taste, String color, String type) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.taste = taste;
        this.color = color;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(id, fruit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}