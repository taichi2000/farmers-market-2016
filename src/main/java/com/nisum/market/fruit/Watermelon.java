package com.nisum.market.fruit;


import com.nisum.market.SeasonName;


public class Watermelon implements Fruit{

    @Override
    public boolean isAvailable(SeasonName season) {
        return false;
    }
}
