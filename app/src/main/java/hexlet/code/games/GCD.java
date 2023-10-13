package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;


public class GCD {
    private static final  String STARTMESSAGE = "Find the greatest common divisor of given numbers.";

    public static void game(Scanner sc) {
        final int countGames = 3;
        String[] arrQuestion = new String[countGames];
        String[] arrAnswer = new String[countGames];
        for (int i = 0; i < arrQuestion.length; i++) {
            int ranNumber1 = Utils.getNumRandom();
            int ranNumber2 = Utils.getNumRandom();

            int resultNumber = getNod(ranNumber1, ranNumber2);
            arrQuestion[i] = ranNumber1 + " " + ranNumber2;
            arrAnswer[i] = String.valueOf(resultNumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestion, arrAnswer);

    }

    public static int getNod(int number1, int number2) {
        int count = Math.max(number1, number2);
        int nod = 1;
        for (int i = 2; i <= count; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                nod = i;
            }
        }
        return nod;
    }


}
