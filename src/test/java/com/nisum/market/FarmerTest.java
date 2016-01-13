package com.nisum.market;


import com.nisum.market.Farmer;
import org.junit.Test;

import static com.nisum.market.FruitName.BANANA;
import static com.nisum.market.FruitName.LEMON;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FarmerTest {

    @Test
    public void shouldSellLemonWhenLemonRequested() throws Exception {
        Farmer farmer = new Farmer();

        Fruit lemon = farmer.giveMeAFruit(LEMON.getName());

        assertThat(lemon, is(instanceOf(Lemon.class)));
    }


    @Test
    public void shouldSellBananaWhenBananaRequested() throws Exception {
        Farmer farmer = new Farmer();

        Fruit banana = farmer.giveMeAFruit(BANANA.getName());

        assertThat(banana, is(instanceOf(Banana.class)));
    }
}
