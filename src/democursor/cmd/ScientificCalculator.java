package democursor.cmd;

/**
 * Scientific calculator functions built on top of {@link Math}.
 */
public class ScientificCalculator {

    public static double sin(double radians) {
        return Math.sin(radians);
    }

    public static double cos(double radians) {
        return Math.cos(radians);
    }

    public static double tan(double radians) {
        return Math.tan(radians);
    }

    public static double log(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("log is only defined for value > 0");
        }
        return Math.log(value);
    }

    public static double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("sqrt is only defined for value >= 0");
        }
        return Math.sqrt(value);
    }

    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

