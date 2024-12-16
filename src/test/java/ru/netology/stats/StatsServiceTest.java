package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void totalSalesYear() {
        StatsService service = new StatsService();
        int[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = 180;
        int actualSum = service.salesAmount(monthsOfSales);

        Assertions.assertEquals(sum, actualSum);

    }

    @Test
    public void averageMonthlySalesForTheYear() {
        StatsService service = new StatsService();
        int[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int averageAmount = 15;
        int actualSum = service.averageSalesAmount(monthsOfSales);

        Assertions.assertEquals(averageAmount, actualSum);

    }

    @Test
    public void maxSalesForTheYear() {
        StatsService service = new StatsService();
        int[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long maxMonth = 8;
        long actualSum = service.maxSales(monthsOfSales);

        Assertions.assertEquals(maxMonth, actualSum);

    }

    @Test
    public void minSalesForTheYear() {
        StatsService service = new StatsService();
        int[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long minMonth = 9;
        long actualSum = service.minSales(monthsOfSales);

        Assertions.assertEquals(minMonth, actualSum);

    }

    @Test
    public void NumberOfMonthsOfSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int numberOfMonths = 5;
        int actualSum = service.numberOfMonthsOfSalesBelowAverage(monthsOfSales);

        Assertions.assertEquals(numberOfMonths, actualSum);

    }

    @Test
    public void NumberOfMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int numberOfMonths = 5;
        int actualSum = service.numberOfMonthsOfSalesAboveAverage(monthsOfSales);

        Assertions.assertEquals(numberOfMonths, actualSum);

    }


}

