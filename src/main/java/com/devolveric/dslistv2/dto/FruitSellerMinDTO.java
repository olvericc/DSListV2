package com.devolveric.dslistv2.dto;

import com.devolveric.dslistv2.entities.FruitSeller;

public class FruitSellerMinDTO {

    private Long id;
    private String firstName;
    private String email;

    public FruitSellerMinDTO() {}

    public FruitSellerMinDTO(FruitSeller entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
}
