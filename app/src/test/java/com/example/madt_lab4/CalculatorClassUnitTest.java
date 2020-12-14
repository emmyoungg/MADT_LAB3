package com.example.madt_lab4;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorClassUnitTest {
    @Test
    public void Given_Zero_Zero_When_AddIsCalled_Then_ZeroReturns() {
        final double given1 = 0;
        final double given2 = 0;
        final int expectedResult = 0;
        final double actualResult = Calculator.add(given1, given2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Zero_Zero_When_SubIsCalled_Then_ZeroReturns() {
        final double given1 = 0;
        final double given2 = 0;
        final int expectedResult = 0;
        final double actualResult = Calculator.sub(given1, given2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Zero_Zero_When_MultIsCalled_Then_ZeroReturns() {
        final double given1 = 0;
        final double given2 = 0;
        final int expectedResult = 0;
        final double actualResult = Calculator.mult(given1, given2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Zero_Zero_When_DivIsCalled_Then_NullReturns() {
        final double given1 = 0;
        final double given2 = 0;
        final Number expectedResult = null;
        final Number actualResult = Calculator.div(given1, given2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_Minus5_Positive10_When_AddIsCalled_Then_Positive5Returns() {
        final double given1 = -5;
        final double given2 = 10;
        final double expectedResult = 5;
        final double actualResult = Calculator.add(given1, given2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Minus5_Positive10_When_SubIsCalled_Then_Negative15Returns() {
        final double given1 = -5;
        final double given2 = 10;
        final double expectedResult = -15;
        final double actualResult = Calculator.sub(given1, given2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Minus5_Positive10_When_MultIsCalled_Then_Negative50Returns() {
        final double given1 = -5;
        final double given2 = 10;
        final double expectedResult = -50;
        final double actualResult = Calculator.mult(given1, given2);

        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void Given_Minus5_Positive10_When_DivIsCalled_Then_NegativePoint5Returns() {
        final double given1 = -5;
        final double given2 = 10;
        final double expectedResult = -0.5;
        final Number actualResult = Calculator.div(given1, given2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_Positive5_Positive2_When_RemIsCalled_Then_Positive1Returns() {
        final double given1 = 5;
        final double given2 = 2;
        final double expectedResult = 1;
        final Number actualResult = Calculator.rem(given1, given2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_Positive10_Positive10_When_RemIsCalled_Then_ZeroReturns() {
        final double given1 = 10;
        final double given2 = 10;
        final double expectedResult = 0;
        final Number actualResult = Calculator.rem(given1, given2);

        assertEquals(expectedResult, actualResult);
    }
}