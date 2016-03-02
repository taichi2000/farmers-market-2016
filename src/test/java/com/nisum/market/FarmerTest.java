package com.nisum.market;


import com.nisum.market.fruit.*;
import org.junit.Before;
import org.junit.Test;

import static com.nisum.market.FruitName.*;
import static com.nisum.market.SeasonName.SUMMER;
import static com.nisum.market.SeasonName.WINTER;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


public class FarmerTest {

    Farmer farmer;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer();
    }


    @Test
    public void shouldSellLemonWhenLemonRequested() throws Exception {

        Fruit lemon = farmer.giveMeAFruit(LEMON.getName());

        assertThat(lemon, is(instanceOf(Lemon.class)));
    }


    @Test
    public void shouldSellBananaWhenBananaRequested() throws Exception {

        Fruit banana = farmer.giveMeAFruit(BANANA.getName());

        assertThat(banana, is(instanceOf(Banana.class)));
    }

    @Test
    public void shouldSellChirimoyaWhenChirimoyaRequested() throws Exception {

        Fruit chirimoya = farmer.giveMeAFruit(CHIRIMOYA.getName());

        assertThat(chirimoya, is(instanceOf(Chirimoya.class)));
    }

    @Test
    public void shouldSellWatermelonWhenWatermelonRequested() throws Exception {

        Fruit watermelon = farmer.giveMeAFruit(WATERMELON.getName());

        assertThat(watermelon, is(instanceOf(Watermelon.class)));
    }


    @Test
    public void isBananaAvailableInWinter() throws Exception {
        Fruit banana = new Banana();

        assertTrue(banana.isAvailable(WINTER));
    }

    @Test
    public void isChirimoyaAvailableInSummer() throws Exception {
        Fruit chirimoya = new Chirimoya();

        assertTrue(chirimoya.isAvailable(SUMMER));
    }


}
