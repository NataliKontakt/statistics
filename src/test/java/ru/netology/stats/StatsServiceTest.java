package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {
    @Test
    public void findSumSales() {
        StatsService service = new StatsService ();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(month);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void findAverageSumSales() {
        StatsService service = new StatsService ();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverageSum = 15;
        double actualAverageSum = service.averageSumSales(month);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void findMaxSales() {
        StatsService service = new StatsService ();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void findMinSales() {
        StatsService service = new StatsService ();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void findMinAverageMonth() {
        StatsService service = new StatsService ();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAverageMonth = 5;
        int actualMinAverageMonth = service.minAverageMonthSales(month);

        Assertions.assertEquals(expectedMinAverageMonth, actualMinAverageMonth);
    }
    @Test
    public void findMaxAverageMonth() {
        StatsService service = new StatsService ();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAverageMonth = 5;
        int actualMaxAverageMonth = service.maxAverageMonthSales(month);

        Assertions.assertEquals(expectedMaxAverageMonth, actualMaxAverageMonth);
    }

}
