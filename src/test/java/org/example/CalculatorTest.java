package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void addShouldReturnSum() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void divideShouldReturnQuotient() {
        assertEquals(4, calc.divide(8, 2));
    }

    @Test
    void divideByZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    void isEvenShouldWork() {
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(7));
    }

    @Test
    void multiplyShouldReturnWork() {
        assertEquals(24, calc.multiply(6, 4));
    }

    @Test
    void multiplyShouldReturnOtritsatDigital() {
        assertEquals(-10, calc.multiply(2, -5));
    }

    @Test
    void multiplyShouldReturnAllOtritsDigital() {
        assertEquals(10, calc.multiply(-2, -5));
    }

    @Test
    void multiplyShouldReturnOnZero() {
        assertEquals(0, calc.multiply(21, 0));
    }

    @Test
    void differenceShouldReturnDiff(){
        assertEquals(6,calc.difference(13,7));
    }
}