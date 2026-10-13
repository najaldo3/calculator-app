
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
     void testAdditionPositive() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
     void testAdditionWithZero() {
        assertEquals(7, calc.add(7, 0));
    }

    @Test
    void testAdditionNegative() {
        assertEquals(-8, calc.add(-3, -5));
    }
}

