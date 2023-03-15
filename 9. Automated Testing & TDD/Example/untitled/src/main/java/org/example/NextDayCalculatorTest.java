package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing add 1 1 2018")
    public void testNextDay1() {
        int date = 1;
        int month = 1;
        int year = 2018;
        String expected = "2 1 2018";
        String result = NextDayCalculator.getNextDayOfMonth(date,month,year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 31 1 2018")
    public void testNextDay2() {
        int date = 31;
        int month = 1;
        int year = 2018;
        String expected = "1 2 2018";
        String result = NextDayCalculator.getNextDayOfMonth(date,month,year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 30 4 2018")
    public void testNextDay3() {
        int date = 30;
        int month = 4;
        int year = 2018;
        String expected = "1 5 2018";
        String result = NextDayCalculator.getNextDayOfMonth(date,month,year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 28 2 2018")
    public void testNextDay4() {
        int date = 28;
        int month = 2;
        int year = 2018;
        String expected = "1 3 2018";
        String result = NextDayCalculator.getNextDayOfMonth(date,month,year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 29 2 2020")
    public void testNextDay5() {
        int date = 29;
        int month = 2;
        int year = 2020;
        String expected = "1 3 2020";
        String result = NextDayCalculator.getNextDayOfMonth(date,month,year);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 31 12 2018")
    public void testNextDay6() {
        int date = 31;
        int month = 12;
        int year = 2018;
        String expected = "1 1 2019";
        String result = NextDayCalculator.getNextDayOfMonth(date,month,year);
        assertEquals(expected, result);
    }
}
