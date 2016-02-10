package com.nisum.market;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static com.nisum.market.FruitName.BANANA;
import static com.nisum.market.FruitName.LEMON;
import static com.nisum.market.FruitName.WATERMELON;
import static com.nisum.market.SeasonName.SUMMER;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class FruitFactoryTest {

    //instanciar con season y verificar que Factory tiene el season correcto




    @Test
    public void shouldReturnWatermelonForASummerSeason() throws Exception {
        FruitFactory factory = new FruitFactory(SUMMER);
        HashMap<SeasonName, List<FruitName>> fruitAvailableOnSeason = new HashMap<SeasonName, List<FruitName>>();
        fruitAvailableOnSeason.put(SUMMER, Arrays.asList(WATERMELON, LEMON));
        factory.setFruitAvailableOnSeason(fruitAvailableOnSeason);

        Fruit fruit = factory.getFruit(WATERMELON.getName());

        assertThat(fruit, instanceOf(Watermelon.class));
    }

    @Test(expected = FruitFactory.FruitNotInSeason.class)
    public void shouldThrowExceptionWhenBananaNotInSeason() throws Exception {
        FruitFactory factory = new FruitFactory(SUMMER);
        HashMap<SeasonName, List<FruitName>> fruitAvailableOnSeason = new HashMap<SeasonName, List<FruitName>>();
        fruitAvailableOnSeason.put(SUMMER, Arrays.asList(WATERMELON, LEMON));
        factory.setFruitAvailableOnSeason(fruitAvailableOnSeason);


        Fruit fruit = factory.getFruit(BANANA.getName());
    }
}