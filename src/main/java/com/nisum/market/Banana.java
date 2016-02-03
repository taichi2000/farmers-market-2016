package com.nisum.market;


import java.util.Arrays;
import java.util.List;

import static com.nisum.market.SeasonName.*;


public class Banana implements Fruit {

    @Override
    public boolean isAvailable(SeasonName season) {
        List<SeasonName> seasons = Arrays.asList(FALL, WINTER, SPRING, SUMMER);

        return seasons.contains(season);
    }
}
