package com.devolveric.dslistv2.dto;

import com.devolveric.dslistv2.entities.Fruit;

public class FruitMinDTO {

    private Long id;
    private String name;
    private String type;

    public FruitMinDTO() {}

    public FruitMinDTO(Fruit entity) {
        id = entity.getId();
        name = entity.getName();
        type = entity.getType();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
