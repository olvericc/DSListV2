package com.devolveric.dslistv2.controllers;

import com.devolveric.dslistv2.dto.FruitSellerMinDTO;
import com.devolveric.dslistv2.services.FruitSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class FruitSellerController {

    @Autowired
    private FruitSellerService fruitSellerService;

    @GetMapping
    public List<FruitSellerMinDTO> searchAllFruitsSellers() {
        return fruitSellerService.searchAllFruitsSellers();
    }
}
