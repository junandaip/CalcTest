/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.junandaip.calctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testToString() {
        Calculator calculator = new Calculator();
        assertEquals("1.0", calculator.toString());
    }

    @Test
    public void testCancelOperation() {
        Calculator calculator = new Calculator();
        assertEquals("0.0", calculator.cancel());
    }

    @Test
    public void testAddOperation() {
        Calculator calculator = new Calculator();
        double input = 3;
        assertEquals("4.0", calculator.add(input));
    }

    @Test
    public void testSubtractOperation() {
        Calculator calculator = new Calculator();
        double input = 3;
        assertEquals("-2.0", calculator.subtract(input));
    }
}
