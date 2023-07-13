package com.devolveric.dslistv2.repositories;

import com.devolveric.dslistv2.entities.Fruit;
import com.devolveric.dslistv2.projections.FruitMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query(
        nativeQuery = true,
        value = """
            SELECT 
                fruits.id, 
                fruits.name, 
                fruits.color,  
                fruits.quantity, 
                fruits.taste, 
                fruits.type, 
                belonging.position
            FROM 
                fruits
            INNER JOIN 
                belonging ON (fruits.id = belonging.fruit_id)
            WHERE
                belonging.list_id = :listId
            ORDER BY 
                belonging.position
                """)
    List<FruitMinProjection> searchByList(Long listId);
}