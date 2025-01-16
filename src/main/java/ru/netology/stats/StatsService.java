package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }

    public long avgSumSalesInMonth(long[] sales) {
        long avgSum = sumAllSales(sales) / sales.length;
        return avgSum;
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

    public int monthsSalesLessAvg(long[] sales) {
        int lessManths = 0;
        long avg = avgSumSalesInMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                lessManths++;
            }
        }
        return lessManths;

    }

    public int monthsSalesMoreAvg(long[] sales) {
        int moreManths = 0;
        long avg = avgSumSalesInMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                moreManths++;
            }
        }
        return moreManths;
    }
}