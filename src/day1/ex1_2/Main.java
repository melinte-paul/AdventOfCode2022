package day1.ex1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("files/input_day1_1.txt");
        SortedSet<Integer> calories = new TreeSet<>();
        Integer currentCalories = 0;

        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("")) {
                    calories.add(currentCalories);
                    currentCalories = 0;
                } else {
                    currentCalories += Integer.parseInt(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(calories.toString());
        System.out.println(74394 + 69863 + 68579);
    }
}
