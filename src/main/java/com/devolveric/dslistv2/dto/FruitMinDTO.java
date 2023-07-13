package com.devolveric.dslistv2.dto;

import com.devolveric.dslistv2.entities.Fruit;
import com.devolveric.dslistv2.projections.FruitMinProjection;

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

    public FruitMinDTO(FruitMinProjection projection) {
        id = projection.getId();
        name = projection.getName();
        type = projection.getType();
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
