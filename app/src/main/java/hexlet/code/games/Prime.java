package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;


public class Prime {
    private static final  String STARTMESSAGE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void game(Scanner sc) {
        final int countGames = 3;

        String[] arrQuestion = new String[countGames];
        String[] arrAnswer = new String[countGames];
        for (int i = 0; i < arrQuestion.length; i++) {
            int checkNumber = Utils.getNumRandom();

            arrQuestion[i] = String.valueOf(checkNumber);
            arrAnswer[i] = askSimple(checkNumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestion, arrAnswer);

    }

    public static String askSimple(Integer number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

}
