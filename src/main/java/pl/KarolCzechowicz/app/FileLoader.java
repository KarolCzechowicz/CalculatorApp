package pl.KarolCzechowicz.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoader {

    public static ArrayList<String> loadFile(String fileName) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String line;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] tab = line.split(" ");
                if (tab.length != 2) {
                    System.out.println("Given command line from instruction contains unallowed number of words. Command line should consist of one word command and number only. \n" +
                            "example: 'add 2'");
                    return null;
                } else if ((tab[1].matches("\\d+") || tab[1].matches("\\d+\\.\\d+")) && (tab[0].equals("add") || tab[0].equals("subtract") || tab[0].equals("multiply") || tab[0].equals("divide") || tab[0].equals("apply"))) {
                    arrayList.add(tab[0]);
                    arrayList.add(tab[1]);
                } else {
                    System.out.println("Please check correctness of commands and numbers. Lines should be in example format: 'add 20'\n" +
                            "supported operations are: 'add', 'subtract', 'divide', 'multiply', 'apply'\n" +
                            "supported numbers are in format: '0' or '0.0'");
                    return null;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
            return null;
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            return null;
        }
        if(arrayList.size() == 0){
            System.out.println("Check correctness of given commands, no matching commands found");
            return null;
        } else if (arrayList.get(arrayList.size() - 2).equals("apply")) {
            return arrayList;
        } else {
            System.out.println("Given instructions must end with line like: 'apply 22', restart program and add file with correct instructions");
            return null;
        }
    }
}