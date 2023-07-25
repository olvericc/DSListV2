package com.devolveric.dslistv2.repositories;

import com.devolveric.dslistv2.entities.FruitList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FruitListRepository extends JpaRepository<FruitList, Long> {

    @Modifying
    @Query(
            nativeQuery = true,
            value = "UPDATE belonging SET position = :newPosition WHERE list_id = :listId AND fruit_id = :fruitId")
    void updateBelongingPosition(@Param("listId") Long listId, @Param("fruitId") Long fruitId, @Param("newPosition") Integer newPosition);
}