package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }

    public long averageSumSalesInMonth(long[] sales) {

        return sumAllSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsSalesLessAverage(long[] sales) {
        int lessManths = 0;
        long average = averageSumSalesInMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lessManths++;
            }
        }
        return lessManths;

    }

    public int monthsSalesMoreAverage(long[] sales) {
        int moreManths = 0;
        long average = averageSumSalesInMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                moreManths++;
            }
        }
        return moreManths;
    }
}