package com.labjunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculatrice {
    
    @Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(3, calculatrice.addition(1, 2));

    }
    
    @Test
    public void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(-1, calculatrice.soustraction(1, 2));
    }
    
    @Test
    public void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(6, calculatrice.multiplication(2, 3));
    }
    
    @Test
    public void testDivision() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.division(6, 3));
    }
    
    @Test
    public void testPuissance() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(8, calculatrice.puissance(2, 3));
    }
    
    @Test
    public void testFactorielle() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(120, calculatrice.factorielle(5));
    }
    
    @Test
    public void testFibonacci() {
        assertEquals(5, Calculatrice.fibonacci(5));
    }
    
    @Test
    public void testPgcd() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(3, calculatrice.pgcd(12, 15));
    }
    
    @Test
    public void testPpcm() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(60, calculatrice.ppcm(12, 15));
    }
    
    @Test
    public void testSommeDesImpairs() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(9, calculatrice.sommeDesImpairs(5));
    }

    // FAIL TESTS

    @Test
    public void testDivisionByZero() {
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.division(6, 0);
            fail("Division by zero should throw an exception");
        } catch (ArithmeticException e) {
            // Expected
        }
    }

    @Test
    public void testFactorielleNegative() {
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.factorielle(-1);
            fail("Factorial of a negative number should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testFibonacciNegative() {
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.fibonacci(-1);
            fail("Fibonacci of a negative number should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testPgcdNegative() {
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.pgcd(-1, 1);
            fail("PGCD of a negative number should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testPpcmNegative() {
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.ppcm(-1, 1);
            fail("PPCM of a negative number should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testSommeDesImpairsNegative() {
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.sommeDesImpairs(-1);
            fail("Sum of odds from 1 to a negative number should throw an exception");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}
