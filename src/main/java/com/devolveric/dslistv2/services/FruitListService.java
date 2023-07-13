package com.devolveric.dslistv2.services;

import com.devolveric.dslistv2.dto.FruitDTO;
import com.devolveric.dslistv2.dto.FruitListDTO;
import com.devolveric.dslistv2.dto.FruitMinDTO;
import com.devolveric.dslistv2.entities.Fruit;
import com.devolveric.dslistv2.entities.FruitList;
import com.devolveric.dslistv2.repositories.FruitListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FruitListService {

    private final FruitListRepository fruitListRepository;

    @Autowired
    public FruitListService(FruitListRepository fruitListRepository) {
        this.fruitListRepository = fruitListRepository;
    }

    @Transactional(readOnly = true)
    public List<FruitListDTO> searchAll() {
        List<FruitList> result = fruitListRepository.findAll();
        return result.stream().map(FruitListDTO::new).toList();
    }
}