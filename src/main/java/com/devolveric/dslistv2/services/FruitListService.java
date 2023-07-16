package com.devolveric.dslistv2.services;

import com.devolveric.dslistv2.dto.FruitListDTO;
import com.devolveric.dslistv2.entities.FruitList;
import com.devolveric.dslistv2.projections.FruitMinProjection;
import com.devolveric.dslistv2.repositories.FruitListRepository;
import com.devolveric.dslistv2.repositories.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FruitListService {

    private final FruitListRepository fruitListRepository;
    private final FruitRepository fruitRepository;

    @Autowired
    public FruitListService(FruitListRepository fruitListRepository, FruitRepository fruitRepository) {
        this.fruitListRepository = fruitListRepository;
        this.fruitRepository = fruitRepository;
    }

    @Transactional(readOnly = true)
    public List<FruitListDTO> searchAll() {
        List<FruitList> result = fruitListRepository.findAll();
        return result.stream().map(FruitListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int targetIndex) {
        List<FruitMinProjection> list = fruitRepository.searchByList(listId);
        FruitMinProjection obj = list.remove(sourceIndex);
        list.add(targetIndex, obj);

        int minimal = sourceIndex < targetIndex ? sourceIndex : targetIndex;
        int maximal = sourceIndex < targetIndex ? targetIndex : sourceIndex;

        for (int i = minimal; i <= maximal; i++) {
            FruitListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}