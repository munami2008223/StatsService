package ru.netology.stats;

public class StatsService {

    public long salesAmount(long[] monthsOfSales) {
        long sum = 0;
        for (long monthsOfSale : monthsOfSales) {
            sum = sum + monthsOfSale;

        }
        return sum;
    }

    public long averageSalesAmount(long[] monthsOfSales) {
        long sum = 0;
        for (long monthsOfSale : monthsOfSales) {
            sum = sum + monthsOfSale;
        }
        return sum / 12;

    }

    public int maxSales(long[] monthsOfSales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < monthsOfSales.length; i++) {
            if (monthsOfSales[i] >= monthsOfSales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] monthsOfSales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < monthsOfSales.length; i++) {
            if (monthsOfSales[i] <= monthsOfSales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long numberOfMonthsOfSalesBelowAverage(long[] monthsOfSales) {
        long average = averageSalesAmount(monthsOfSales);
        long numberOfMonths = 0; //счётчик месяцев с продажами ниже среднего

        for (long monthsOfSale : monthsOfSales) {
            if (monthsOfSale < average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public long numberOfMonthsOfSalesAboveAverage(long[] monthsOfSales) {
        long average = averageSalesAmount(monthsOfSales);
        long numberOfMonths = 0; //счётчик месяцев с продажами выше среднего
        for (long monthsOfSale : monthsOfSales) {
            if (monthsOfSale > average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}




