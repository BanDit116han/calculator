package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
        assertEquals(0.0, calculator.add(-5.0, 5.0), 0.001);
        assertEquals(10.5, calculator.add(5.25, 5.25), 0.001);
    }

    @Test
    void testSubtract() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), 0.001);
        assertEquals(-10.0, calculator.subtract(-5.0, 5.0), 0.001);
        assertEquals(0.0, calculator.subtract(5.0, 5.0), 0.001);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.001);
        assertEquals(0.0, calculator.multiply(5.0, 0.0), 0.001);
        assertEquals(-10.0, calculator.multiply(-5.0, 2.0), 0.001);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.001);
        assertEquals(-3.0, calculator.divide(-9.0, 3.0), 0.001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10.0, 0.0);
        });
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.001);
        assertEquals(1.0, calculator.power(5.0, 0.0), 0.001);
        assertEquals(0.25, calculator.power(2.0, -2.0), 0.001);
    }

    @Test
    void testSqrt() {
        assertEquals(4.0, calculator.sqrt(16.0), 0.001);
        assertEquals(0.0, calculator.sqrt(0.0), 0.001);
        assertEquals(5.0, calculator.sqrt(25.0), 0.001);
    }

    @Test
    void testSqrtNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sqrt(-1.0);
        });
    }
}

