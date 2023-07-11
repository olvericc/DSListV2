package com.devolveric.dslistv2.repositories;

import com.devolveric.dslistv2.entities.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Long> { }