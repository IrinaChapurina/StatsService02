package ru.netology.stats;

public class StatsService {
    //1 метод. Сумма всех продаж
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        
        return result;
    }

    //2 метод. Средняя сумма продаж за год
    public double averageSum(long[] sales) {
        double result = 0;
        result = (double) sum(sales) / sales.length;
        return result;


    }

    //3 метод. номер последнего месяца макс.продажи
    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }


    //4. метод. номер месяца мин. продажи
    public int minimum(long[] sales) {
        int minimumMonth = 0;
        long minimumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumSale = sales[i];
                minimumMonth = i;
            }
        }
        return minimumMonth + 1;
    }

    //5 метод.Количество месяцев, в которых продажи были ниже среднего
    public double quantityLessAverageSum(long[] sales) {
        double result = 0;
        result = averageSum(sales);
        int lessAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < result) {
                lessAverage = lessAverage + 1;
            }

        }
        return lessAverage;
    }

    //6 метод.Количество месяцев, в которых продажи были выше среднего
    public double quantityMoreAverageSum(long[] sales) {
        double result = 0;
        result = averageSum(sales);
        int moreAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > result) {
                moreAverage = moreAverage + 1;
            }

        }
        return moreAverage;
    }

}

