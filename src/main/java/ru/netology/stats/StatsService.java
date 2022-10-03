package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }
    public double averageSumSales(int[] sales) {
        double sum = sumSales(sales);
        double averageSum = sum/12;
        return averageSum;

    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minAverageMonthSales(int[] sales) {
        int counter = 0;
        double minAverageMonth = averageSumSales (sales);
        for (int sale : sales) {
            if (sale < averageSumSales(sales)) {
                counter += 1;
            }
        }
        return counter;
    }
    public int maxAverageMonthSales(int[] sales) {
        int counter = 0;
        double maxAverageMonth = averageSumSales (sales);
        for (int sale : sales) {
            if (sale > averageSumSales(sales)) {
                counter += 1;
            }
        }
        return counter;
    }
}
