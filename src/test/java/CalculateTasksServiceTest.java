import org.junit.jupiter.api.Test;
import pl.KarolCzechowicz.app.CalculateTasksService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTasksServiceTest {

    @Test
    void add_addNegativeNumberToZero_addNumber() {
        double a = -200;
        double b = 0;
        double expected = -200;
        double actual = CalculateTasksService.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void subtract_subtractNegativeNumberFromPositive_subtractNumber() {
        double a = 200;
        double b = -100.0;
        double expected = 300;
        double actual = CalculateTasksService.subtract(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void multiply_multiplyNegativeNumberByPositive_multiplyNumber() {
        double a = -200;
        double b = 100.0;
        double expected = -20000;
        double actual = CalculateTasksService.multiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void divide_dividePositiveByZero_throwException() {

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> CalculateTasksService.divide(20, 0));
        assertTrue(thrown.getMessage().equals("* Argument 'divisor' is 0"));
    }

    @Test
    void power_elevateNegativeToThePowerOfPositive_elevatesNumberToGivenPower() {
        double a = -200;
        double b = 3;
        double expected = -8000000;
        double actual = CalculateTasksService.power(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void root_0ThRootFromPositiveNumber_throwException() {

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> CalculateTasksService.root(200, 0));
        assertTrue(thrown.getMessage().equals("* Argument 'divisor' is 0"));
    }

    @Test
    void root_nThRootFromNegativeNumber_throwException() {

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> CalculateTasksService.root(-200, 2));
        assertTrue(thrown.getMessage().equals("* We can't get nth root from negative number due to using log in calculations *"));
    }
}
