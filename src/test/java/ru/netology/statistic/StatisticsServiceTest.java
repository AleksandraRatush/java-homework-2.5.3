package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 0;
    long actual = service.findMax(incomesInBillions);
  }

  @Test
  void findMaxLast() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {1,2,3,4,5};
    long expected = 4;
    long actual = service.findMax(incomesInBillions);
  }
}