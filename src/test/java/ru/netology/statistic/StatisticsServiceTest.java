package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtStart() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11};
        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5, 8, 4, 20, 3, 8, 6, 11, 12, 7};
        long expected = 20;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {5, 8, 4, 3, 8, 6, 11, 7, 22};
        long expected = 22;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}