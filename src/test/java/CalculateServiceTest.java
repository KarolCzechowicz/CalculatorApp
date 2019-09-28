import org.junit.jupiter.api.Test;
import pl.KarolCzechowicz.app.CalculateService;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateServiceTest {

    @Test
    void calculate_addPositive_addNumbers() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("add");
        arrayList.add("20");
        arrayList.add("apply");
        arrayList.add("1");

        double expected = 21;
        double actual = CalculateService.calculate(arrayList);
        assertEquals(expected, actual);
    }

    @Test
    void calculate_subtractPositiveFromNegative_subtractNumbers() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("subtract");
        arrayList.add("20");
        arrayList.add("apply");
        arrayList.add("-1");

        double expected = -21;
        double actual = CalculateService.calculate(arrayList);
        assertEquals(expected, actual);
    }

    @Test
    void calculate_multiplyPositiveByNegative_multiplyNumbers() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("multiply");
        arrayList.add("-20");
        arrayList.add("apply");
        arrayList.add("2");

        double expected = -40;
        double actual = CalculateService.calculate(arrayList);
        assertEquals(expected, actual);
    }

    @Test
    void calculate_dividePositiveByNegative_divideNumbers() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("divide");
        arrayList.add("-20");
        arrayList.add("apply");
        arrayList.add("2");

        double expected = -0.1;
        double actual = CalculateService.calculate(arrayList);
        assertEquals(expected, actual);
    }

    @Test
    void calculate_elevatePositiveToThePowerOfNegative_elevatesNumberToGivenPower() {
        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("power");
        arrayList.add("-3");
        arrayList.add("apply");
        arrayList.add("2");

        double expected = 0.125;
        double actual = CalculateService.calculate(arrayList);
        assertEquals(expected, actual);
    }

    @Test
    void calculate_nthRootFromPositiveNumber_rootNumber() {
        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("root");
        arrayList.add("3");
        arrayList.add("apply");
        arrayList.add("200");

        double expected = 5.85;
        double actual = CalculateService.calculate(arrayList);
        assertEquals(expected, actual);
    }
}
