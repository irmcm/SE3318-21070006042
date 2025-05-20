package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Smoke test for loop control and example usage.
 */
public class AppTest {

    @Test
    public void testSumOfSquares() {
        LoopControl lc = new LoopControl();
        assertEquals(385, lc.sumOfSquares());
    }

    @Test
    public void testEvenNumberCount() {
        ExampleUsage ex = new ExampleUsage();
        assertEquals(10, ex.filterAndCountEvenNumbers());
    }

    @Test
    public void testMatrixDiagonalSum() {
        ExampleUsage ex = new ExampleUsage();
        assertEquals(15, ex.matrixDiagonalSum());
    }
}

