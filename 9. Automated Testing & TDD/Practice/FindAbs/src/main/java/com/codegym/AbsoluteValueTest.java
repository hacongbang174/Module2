package com.codegym;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteValueTest {
    @Test
    @DisplayName("Testing abs 0")
    public void testAbsoluteValue() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteValue.abs(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing abs 1")
    public void testAbsoluteValue1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteValue.abs(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing abs -1")
    public void testAbsoluteValue2() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteValue.abs(number);
        assertEquals(expected, result);
    }
}
