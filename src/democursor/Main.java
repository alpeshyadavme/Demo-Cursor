package democursor;

import democursor.cmd.Calculator;
import democursor.cmd.Operation;
import democursor.cmd.ScientificCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basic calculator demo:");

        // Using calculate directly
        try {
            double result = Calculator.calculate(10, 3, Operation.ADD);
            System.out.println("10 + 3 = " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Using runCalculator helper
        Calculator.runCalculator(15, 5, Operation.DIVIDE);
        Calculator.runCalculator(7, 4, Operation.MULTIPLY);

        System.out.println();
        System.out.println("Scientific calculator demo:");

        double angleRad = Math.toRadians(30); // 30 degrees
        System.out.println("sin(30°) = " + ScientificCalculator.sin(angleRad));
        System.out.println("cos(30°) = " + ScientificCalculator.cos(angleRad));

        System.out.println("sqrt(16) = " + ScientificCalculator.sqrt(16));
        System.out.println("log(10) = " + ScientificCalculator.log(10));
        System.out.println("2^8 = " + ScientificCalculator.pow(2, 8));
    }
}
