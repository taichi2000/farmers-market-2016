package com.nisum.market;


import com.nisum.market.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class FruitFactory {

    private final SeasonName season;

    private HashMap<SeasonName,List<FruitName>> fruitAvailableOnSeason;


    public FruitFactory(Class<FruitsPerSeason> fruitsPerSeason) {
        season = SeasonName.SUMMER;
        fruitAvailableOnSeason = new HashMap<SeasonName, List<FruitName>>();

        for (FruitsPerSeason season : fruitsPerSeason.getEnumConstants()) {
            FruitName[] fruits = season.getFruitNames();

            List<FruitName> fruitNames = Arrays.asList(fruits);

            fruitAvailableOnSeason.put(SeasonName.valueOf(season.name()), fruitNames);
        }
    }


    public FruitFactory(SeasonName season) {
        this.season = season;

        fruitAvailableOnSeason = new HashMap<SeasonName, List<FruitName>>();
        List<FruitName>fruitNames = new ArrayList<FruitName>();
        fruitNames.add(FruitName.BANANA);
        fruitNames.add(FruitName.CHIRIMOYA);
        fruitNames.add(FruitName.LEMON);
        fruitNames.add(FruitName.WATERMELON);
        fruitAvailableOnSeason.put(season,fruitNames);
    }


    public HashMap<SeasonName, List<FruitName>> getFruitAvailableOnSeason() {
        return fruitAvailableOnSeason;
    }


    public void setFruitAvailableOnSeason(
            HashMap<SeasonName, List<FruitName>> fruitAvailableOnSeason) {
        this.fruitAvailableOnSeason = fruitAvailableOnSeason;
    }


    public Fruit getFruit(String fruitName) {
        if (isAvailableInSeason(fruitName)){
            return FruitName.getFruit(fruitName);
        } else {
            throw new FruitNotInSeason();
        }
    }


    private boolean isAvailableInSeason(String fruitName) {
        return fruitAvailableOnSeason.get(season).contains(FruitName.getFruitName(fruitName));
    }


    class FruitNotInSeason extends RuntimeException {
    }
}
