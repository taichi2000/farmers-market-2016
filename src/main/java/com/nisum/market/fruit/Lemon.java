package com.nisum.market.fruit;


import com.nisum.market.SeasonName;


public class Lemon implements Fruit{

    @Override
    public boolean isAvailable(SeasonName season) {
        return false;
    }
}
