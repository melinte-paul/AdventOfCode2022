package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static int calculateRoundScore(char opponent, char response) {
        if(opponent == 'A' && response == 'X') {
            return 1 + 3;
        }
        if(opponent == 'A' && response == 'Y') {
            return 2 + 6;
        }
        if(opponent == 'A' && response == 'Z') {
            return 3 + 0;
        }
        if(opponent == 'B' && response == 'X') {
            return 1 + 0;
        }
        if(opponent == 'B' && response == 'Y') {
            return 2 + 3;
        }
        if(opponent == 'B' && response == 'Z') {
            return 3 + 6;
        }
        if(opponent == 'C' && response == 'X') {
            return 1 + 6;
        }
        if(opponent == 'C' && response == 'Y') {
            return 2 + 0;
        }
        if(opponent == 'C' && response == 'Z') {
            return 3 + 3;
        }
        return 0;
    }

    private static int calculateRoundScore2(char opponent, char response) {
        int score = 0;
        if (response == 'X') {
            score += 0;
            if (opponent == 'A') {
                score += 3;
            }
            if (opponent == 'B') {
                score += 1;
            }
            if (opponent == 'C') {
                score += 2;
            }
        }
        if (response == 'Y') {
            score += 3;
            if (opponent == 'A') {
                score += 1;
            }
            if (opponent == 'B') {
                score += 2;
            }
            if (opponent == 'C') {
                score += 3;
            }
        }
        if (response == 'Z') {
            score += 6;
            if (opponent == 'A') {
                score += 2;
            }
            if (opponent == 'B') {
                score += 3;
            }
            if (opponent == 'C') {
                score += 1;
            }
        }

        return score;
    }


    public static void main(String[] args) {
        File inputFile = new File("files/input_day2_1.txt");
        int score = 0;
        int score2 = 0;

        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                score += calculateRoundScore(line.charAt(0), line.charAt(2));
                score2 += calculateRoundScore2(line.charAt(0), line.charAt(2));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(score);
        System.out.println(score2);
    }
}
