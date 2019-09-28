package pl.KarolCzechowicz.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n*** Welcome to my Calculator App! ***\n\n" +
                "** Please provide File Name of Your text file with extension below - example: filename.txt.\n" +
                "This Calculator supports commands such as: add, subtract, multiply, divide and apply. \n" +
                "If You want to quit input 'q'. **");
        Scanner scan = new Scanner(System.in);
        String fileName;

        while (true) {
            fileName = scan.nextLine();
            if (fileName.equals("q")) {
                System.out.println("Quitting");
                break;
            } else if (fileName.matches("[^\\\\/:*?\"<>|]+\\.[^\\\\/:*?\"<>|]+")) {
                System.out.println("File name " + fileName + " is valid");
                ArrayList<String> arrayList = FileLoader.loadFile(fileName);
                if (arrayList == null) {
                    System.out.println("Quitting");
                    break;
                } else {
                    double solution = CalculateService.calculate(arrayList);
                    System.out.println("Calculations Completed!\n" +
                            "***************************\n" +
                            "* Answer is: " + solution + " *\n" +
                            "***************************\n");
                    System.out.println("You can add new file name with instructions below or quit by 'q'");
                }

            } else {
                System.out.println("File name is incorrect please input correct file name - example: filename.txt");
            }
        }
        scan.close();
    }
}
