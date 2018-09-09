package com.dnk;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CandleCollectionTest {

    private CandleCollection candles = new CandleCollection("E:\\DEV\\Trading\\tests\\resources\\testCreateCandleCollection.txt");

    @Test
    public void getCandles() {


        List<Candle> actually = candles.getCandles();

        List<Candle> expected = new ArrayList<>();
        expected.add(new Candle("20170907,000000,1.1915800,1.2059700,1.1913000,1.2020000,1894644"));
        expected.add(new Candle("20170908,000000,1.2022800,1.2092400,1.2013000,1.2033400,1846447"));
        expected.add(new Candle("20170909,000000,1.2035000,1.2035000,1.2035000,1.2035000,1"));

        Assert.assertEquals(actually, expected);
    }
}