package com.devolveric.dslistv2.dto;

import com.devolveric.dslistv2.entities.Fruit;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

public class FruitDTO {

    private Long id;
    private String name;
    private Integer quantity;
    private String taste;
    private String color;
    private String type;

    public FruitDTO() {}

    public FruitDTO(Fruit entity) {
        BeanUtils.copyProperties(entity, this);
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
}