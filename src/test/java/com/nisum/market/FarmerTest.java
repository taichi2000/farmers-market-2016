package com.nisum.market;


import com.nisum.market.Farmer;
import org.junit.Test;

import static com.nisum.market.FruitName.*;
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

    @Test
    public void shouldSellChirimoyaWhenChirimoyaRequested() throws Exception {
        Farmer farmer = new Farmer();

        Fruit chirimoya = farmer.giveMeAFruit(CHIRIMOYA.getName());

        assertThat(chirimoya, is(instanceOf(Chirimoya.class)));
    }

    @Test
    public void shouldSellWatermelonWhenWatermelonRequested() throws Exception {
        Farmer farmer = new Farmer();

        Fruit chirimoya = farmer.giveMeAFruit(WATERMELON.getName());

        assertThat(chirimoya, is(instanceOf(Watermelon.class)));
    }
}
