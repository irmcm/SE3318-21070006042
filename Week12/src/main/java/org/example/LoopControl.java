package org.example;

/**
 * Class demonstrating loop control rule compliance and violations for Checkstyle.
 */
public class LoopControl {

    /**
     * Calculates the sum of squares of the first 10 positive integers.
     * Checkstyle: Demonstrates proper variable declaration usage.
     */
    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            sum += square;
        }
        return sum;
    }

    /**
     * Prints a right-angled triangle of asterisks with height 5.
     * Checkstyle: Avoids empty blocks.
     */
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Demonstrates improper modification of the loop control variable.
     * Checkstyle: Violates ModifiedControlVariable rule intentionally.
     */
    public void modifyIndexIncorrectly() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i before modification: " + i);
            i++; // Violation: modifying loop control variable inside the loop
        }
    }
}
