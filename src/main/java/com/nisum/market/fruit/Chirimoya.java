package com.nisum.market.fruit;


import com.nisum.market.SeasonName;

import java.util.Arrays;
import java.util.List;

import static com.nisum.market.SeasonName.*;


public class Chirimoya implements Fruit {

    @Override
    public boolean isAvailable(SeasonName season) {
        List<SeasonName> seasons = Arrays.asList(SPRING, SUMMER);

        return seasons.contains(season);
    }
}
