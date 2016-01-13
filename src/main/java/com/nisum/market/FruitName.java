package com.nisum.market;


/**
 * Created by german on 13-01-16.
 */
public enum FruitName {

    LEMON("lemon"),BANANA("banana");


    private final String name;


    FruitName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

}
