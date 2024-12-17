package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void totalSalesYear() {
        StatsService service = new StatsService();
        long[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sum = 180;
        long actualSum = service.salesAmount(monthsOfSales);

        Assertions.assertEquals(sum, actualSum);

    }

    @Test
    public void averageMonthlySalesForTheYear() {
        StatsService service = new StatsService();
        long[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long averageAmount = 15;
        long actualSum = service.averageSalesAmount(monthsOfSales);

        Assertions.assertEquals(averageAmount, actualSum);

    }

    @Test
    public void maxSalesForTheYear() {
        StatsService service = new StatsService();
        long[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int maxMonth = 8;
        int actualSum = service.maxSales(monthsOfSales);

        Assertions.assertEquals(maxMonth, actualSum);

    }

    @Test
    public void minSalesForTheYear() {
        StatsService service = new StatsService();
        long[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int minMonth = 9;
        int actualSum = service.minSales(monthsOfSales);

        Assertions.assertEquals(minMonth, actualSum);

    }

    @Test
    public void NumberOfMonthsOfSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long numberOfMonths = 5;
        long actualSum = service.numberOfMonthsOfSalesBelowAverage(monthsOfSales);

        Assertions.assertEquals(numberOfMonths, actualSum);

    }

    @Test
    public void NumberOfMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] monthsOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long numberOfMonths = 5;
        long actualSum = service.numberOfMonthsOfSalesAboveAverage(monthsOfSales);

        Assertions.assertEquals(numberOfMonths, actualSum);

    }


}

