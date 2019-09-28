package pl.KarolCzechowicz.app;

abstract class CalculateTasksService {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0.0 || b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        } else {
            return a / b;
        }
    }
}
