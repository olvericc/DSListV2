package com.devolveric.dslistv2.controllers;

import com.devolveric.dslistv2.dto.FruitListDTO;
import com.devolveric.dslistv2.dto.FruitMinDTO;
import com.devolveric.dslistv2.dto.ReplacementDTO;
import com.devolveric.dslistv2.services.FruitListService;
import com.devolveric.dslistv2.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class FruitListController {

    private final FruitListService fruitListService;
    private final FruitService fruitService;

    @Autowired
    public FruitListController(FruitListService fruitListService, FruitService fruitService) {
        this.fruitListService = fruitListService;
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<FruitListDTO> searchAllFruitLists() {
        return fruitListService.searchAll();
    }

    @GetMapping (value = "/{listId}/fruits")
    public List<FruitMinDTO> searchByList(@PathVariable Long listId) {
        return fruitService.searchByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        fruitListService.move(listId, body.getSourceIndex(), body.getTargetIndex());
    }
}