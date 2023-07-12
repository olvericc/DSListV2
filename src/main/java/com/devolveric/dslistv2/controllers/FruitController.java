package com.devolveric.dslistv2.controllers;

import com.devolveric.dslistv2.dto.FruitDTO;
import com.devolveric.dslistv2.dto.FruitMinDTO;
import com.devolveric.dslistv2.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @GetMapping
    public List<FruitMinDTO> searchAllFruits() {
        return fruitService.searchAllFruits();
    }

    @GetMapping(value = "/{id}")
    public FruitDTO searchFruitsById(@PathVariable Long id) {
        FruitDTO result = fruitService.searchById(id);
        return  result;
    }
}