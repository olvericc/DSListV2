package com.devolveric.dslistv2.repositories;

import com.devolveric.dslistv2.entities.FruitList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitListRepository extends JpaRepository<FruitList, Long> { }