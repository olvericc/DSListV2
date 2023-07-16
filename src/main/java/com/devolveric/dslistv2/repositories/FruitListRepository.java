package com.devolveric.dslistv2.repositories;

import com.devolveric.dslistv2.entities.FruitList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FruitListRepository extends JpaRepository<FruitList, Long> {

    @Modifying
    @Query(
            nativeQuery = true,
            value =
                    """
            UPDATE
                belonging
            SET
                position = :newPosition
            WHERE
                list_id :listId
            AND
                fruit_id = :fruitId
            """)
    static void updateBelongingPosition(Long listId, Long fruitId, Integer newPosition) {
    }
}