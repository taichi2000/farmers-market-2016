package com.nisum.market;

public class Farmer {

    public Fruit giveMeAFruit(String fruitName) {

       Fruit fruit = (FruitName.LEMON.getName().equalsIgnoreCase(fruitName))? new Lemon() : new Banana();

        return fruit;
    }
}
