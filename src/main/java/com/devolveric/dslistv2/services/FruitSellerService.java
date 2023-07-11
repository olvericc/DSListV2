package com.devolveric.dslistv2.services;

import com.devolveric.dslistv2.dto.FruitSellerMinDTO;
import com.devolveric.dslistv2.entities.FruitSeller;
import com.devolveric.dslistv2.repositories.FruitSellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitSellerService {

    private final FruitSellerRepository fruitSellerRepository;

    @Autowired
    public FruitSellerService(FruitSellerRepository fruitSellerRepository) {
        this.fruitSellerRepository = fruitSellerRepository;
    }

    public List<FruitSellerMinDTO> searchAllFruitsSellers() {
        List<FruitSeller> result = fruitSellerRepository.findAll();
        return result.stream().map(FruitSellerMinDTO::new).toList();
    }

}
