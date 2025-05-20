package org.example;

/**
 * Main class to demonstrate loop control examples and usage.
 */
public class App {

    /**
     * Main method that executes all functionality.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        LoopControl lc = new LoopControl();

        System.out.println("Sum of squares: " + lc.sumOfSquares());

        System.out.println("\nTriangle:");
        lc.printTriangle();

        System.out.println("\nLoop index modification:");
        lc.modifyIndexIncorrectly();

        ExampleUsage ex = new ExampleUsage();
        int evenCount = ex.filterAndCountEvenNumbers();
        System.out.println("\nEven numbers from 1 to 20: " + evenCount);

        int diagonalSum = ex.matrixDiagonalSum();
        System.out.println("Diagonal sum of 3x3 matrix: " + diagonalSum);
    }
}
