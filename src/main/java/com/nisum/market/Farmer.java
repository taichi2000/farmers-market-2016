package com.nisum.market;


import com.nisum.market.fruit.Fruit;


public class Farmer {

    public Fruit giveMeAFruit(String fruitName) {
        return new FruitFactory(SeasonName.SUMMER).getFruit(fruitName);
    }
}
