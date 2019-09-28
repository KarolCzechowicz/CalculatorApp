package pl.KarolCzechowicz.app;

import java.text.DecimalFormat;

public class CalculateTasksService {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0.0 || b == 0) {
            throw new IllegalArgumentException("* Argument 'divisor' is 0");
        } else {
            return a / b;
        }
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double root(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("* Argument 'divisor' is 0");
        } else if (a < 0) {
            throw new IllegalArgumentException("* We can't get nth root from negative number due to using log in calculations *");
        } else {
            DecimalFormat df = new DecimalFormat("0.00");
            String str = df.format(Math.pow(Math.E, Math.log(a) / b));
            String stringDouble = str.replace(',', '.');

            return Double.valueOf(stringDouble);
        }
    }
}
