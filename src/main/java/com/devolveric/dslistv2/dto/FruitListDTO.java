package com.devolveric.dslistv2.dto;

import com.devolveric.dslistv2.entities.FruitList;
import org.springframework.beans.BeanUtils;

public class FruitListDTO {

    private Long id;
    private String name;

    public FruitListDTO() {}

    public FruitListDTO(FruitList entity) {
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
}
