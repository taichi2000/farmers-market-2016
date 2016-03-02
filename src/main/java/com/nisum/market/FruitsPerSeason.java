package com.nisum.market;


import com.nisum.market.fruit.*;

import static com.nisum.market.FruitName.*;


public enum FruitsPerSeason {
    SUMMER(BANANA, CHIRIMOYA, WATERMELON, LEMON),
    WINTER(LEMON),
    FALL(LEMON),
    SPRING(WATERMELON);

    private final FruitName[] fruitNames;


    FruitsPerSeason(FruitName... fruitNames) {
        this.fruitNames = fruitNames;
    }


    public FruitName[] getFruitNames() {
        return fruitNames;
    }
}
