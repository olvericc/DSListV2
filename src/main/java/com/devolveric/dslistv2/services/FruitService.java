package com.devolveric.dslistv2.services;

import com.devolveric.dslistv2.dto.FruitMinDTO;
import com.devolveric.dslistv2.entities.Fruit;
import com.devolveric.dslistv2.repositories.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    @Autowired
    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public List<FruitMinDTO> searchAllFruits() {
        List<Fruit> result = fruitRepository.findAll();
        return result.stream().map(FruitMinDTO::new).toList();
    }
}