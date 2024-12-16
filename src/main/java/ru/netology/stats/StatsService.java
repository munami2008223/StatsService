package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] monthsOfSales) {
        int sum = 0;
        for (int monthsOfSale : monthsOfSales) {
            sum = sum + monthsOfSale;

        }
        return sum;
    }

    public int averageSalesAmount(int[] monthsOfSales) {
        int sum = 0;
        for (int monthsOfSale : monthsOfSales) {
            sum = sum + monthsOfSale;
        }
        return sum / 12;

    }

    public int maxSales(int[] monthsOfSales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < monthsOfSales.length; i++) {
            if (monthsOfSales[i] >= monthsOfSales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] monthsOfSales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < monthsOfSales.length; i++) {
            if (monthsOfSales[i] <= monthsOfSales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int numberOfMonthsOfSalesBelowAverage(int[] monthsOfSales) {
        int average = averageSalesAmount(monthsOfSales);
        int numberOfMonths = 0; //счётчик месяцев с продажами ниже среднего

        for (int monthsOfSale : monthsOfSales) {
            if (monthsOfSale < average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int numberOfMonthsOfSalesAboveAverage(int[] monthsOfSales) {
        int average = averageSalesAmount(monthsOfSales);
        int numberOfMonths = 0; //счётчик месяцев с продажами выше среднего
        for (int monthsOfSale : monthsOfSales) {
            if (monthsOfSale > average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}




