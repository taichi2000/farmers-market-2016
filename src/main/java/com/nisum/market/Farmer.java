package com.nisum.market;


public class Farmer {

    public Fruit giveMeAFruit(String fruitName) {
        return new FruitFactory().getFruit(fruitName);

/*        Fruit fruit;
        switch (FruitName.getFruitName(fruitName)) {
            case LEMON:
                fruit = new Lemon();
                break;
            case BANANA:
                fruit = new Banana();
                break;
            case CHIRIMOYA:
                fruit = new Chirimoya();
                break;
            default:
                fruit = null;
        }

        return fruit;*/
    }
}
