package day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int getPriority(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + 1;
        }
        return c - 'A' + 27;
    }

    public static void main(String[] args) {
        File inputFile = new File("files/input_day3_1.txt");
        int sumPriority = 0;

        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String firstHalf = line.substring(0, line.length() / 2);
                String secondHalf = line.substring(line.length() / 2);

                int[] freqVector = new int[53];

                for (char c : firstHalf.toCharArray()) {
                    freqVector[getPriority(c)] = 1;
                }

                for (char c : secondHalf.toCharArray()) {
                    if (freqVector[getPriority(c)] == 1) {
                        sumPriority += getPriority(c);
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sumPriority);

        inputFile = new File("files/input_day3_1.txt");
        sumPriority = 0;

        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line1 = scanner.nextLine();
                String line2 = scanner.nextLine();
                String line3 = scanner.nextLine();

                int[] freqVector = new int[53];

                for (char c : line1.toCharArray()) {
                    freqVector[getPriority(c)] = 1;
                }

                for (char c : line2.toCharArray()) {
                    if(freqVector[getPriority(c)] == 1) {
                        freqVector[getPriority(c)] = 2;
                    }
                }

                for (char c : line3.toCharArray()) {
                    if (freqVector[getPriority(c)] == 2) {
                        sumPriority += getPriority(c);
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sumPriority);

    }
}
