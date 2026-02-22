package democursor.cmd;

/**
 * Calculator with basic arithmetic operations.
 */
public class Calculator {

    /**
     * Performs the given operation on a and b and returns the result.
     * @throws ArithmeticException for division by zero
     * @throws IllegalArgumentException for unknown operation
     */
    public static double calculate(double a, double b, Operation op) {
        switch (op) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("unknown operation: " + op);
        }
    }

    /**
     * Helper that runs the calculator and prints the result.
     */
    public static void runCalculator(double a, double b, Operation op) {
        try {
            double result = calculate(a, b, op);
            System.out.printf("%s %s %s = %s%n", a, op.getSymbol(), b, result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
