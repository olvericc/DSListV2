package com.devolveric.dslistv2.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "fruit_list")
public class FruitList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public FruitList() {}

    public FruitList(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitList fruitList = (FruitList) o;
        return Objects.equals(id, fruitList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}