package com.devolveric.dslistv2.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "fruit_id")
    private Fruit fruit;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private FruitList list;

    public BelongingPK() {}

    public BelongingPK(Fruit fruit, FruitList list) {
        this.fruit = fruit;
        this.list = list;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public FruitList getList() {
        return list;
    }

    public void setList(FruitList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(fruit, that.fruit) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, list);
    }
}