package com.nisum.market;


public class Lemon implements Fruit{

    @Override
    public boolean isAvailable(SeasonName season) {
        return false;
    }
}
