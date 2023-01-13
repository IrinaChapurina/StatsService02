package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    //1 метод.
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }
    //2 метод
    @Test
    public void testAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = service.averageSum(sales);
        double expected = (double) (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);

    }
    //3 метод
    @Test
    public void testMaximum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maximum(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }
    //4 метод
    @Test
    public void testMinimum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minimum(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }
    //5 метод
    @Test
    public void testQuantityLessAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.quantityLessAverageSum(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    //6 метод
    @Test
    public void testQuantityMoreAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = (int) service.quantityMoreAverageSum(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }
    }
