package com.devolveric.dslistv2.controllers;

import com.devolveric.dslistv2.dto.FruitListDTO;
import com.devolveric.dslistv2.services.FruitListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class FruitListController {

    @Autowired
    private FruitListService fruitListService;

    @GetMapping
    public List<FruitListDTO> searchAllFruitLists() {
        return fruitListService.searchAll();
    }
}