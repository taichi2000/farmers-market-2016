package com.nisum.market;


public class Farmer {

    public Fruit giveMeAFruit(String fruitName) {
        return new FruitFactory(SeasonName.SUMMER).getFruit(fruitName);
    }
}
