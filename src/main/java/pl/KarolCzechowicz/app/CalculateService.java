package pl.KarolCzechowicz.app;

import java.util.ArrayList;

public class CalculateService extends CalculateTasksService {

    public static double calculate(ArrayList<String> arrayList) {
        double solution = Double.valueOf(arrayList.get(arrayList.size() - 1));

        for (int i = 0; i < arrayList.size(); i += 2) {

            double b = Double.valueOf(arrayList.get(i + 1));

            if (arrayList.get(i).equals("add")) {
                solution = add(solution, b);
            } else if (arrayList.get(i).equals("subtract")) {
                solution = subtract(solution, b);
            } else if (arrayList.get(i).equals("multiply")) {
                solution = multiply(solution, b);
            } else if (arrayList.get(i).equals("divide")) {
                try {
                    solution = divide(solution, b);
                } catch (IllegalArgumentException e) {
                    System.out.println("* Divider can't equal 0 *");
                    System.out.println("* Divide action will be skipped *");
                }
            }
        }
        return solution;
    }
}
