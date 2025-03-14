package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        StatisticsService servise = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        System.out.println(servise.findMax(incomesInBillions));
    }
}