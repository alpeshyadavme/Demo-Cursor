package democursor;

import democursor.cmd.Calculator;
import democursor.cmd.Operation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator demo:");

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
    }
}
