package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;

public class Prime {
    private static final  String STARTMESSAGE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void play(Scanner sc) {
        String[][] arrQuestionAnswer = new String[Engine.COUNTGAMES][Engine.COUNTARRAYCOLUMN];
        for (int i = 0; i < arrQuestionAnswer.length; i++) {
            int checkNumber = Utils.getNumRandom();
            arrQuestionAnswer[i][0] = String.valueOf(checkNumber);
            arrQuestionAnswer[i][1] = isPrime(checkNumber) ? "yes" : "no";
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

    }

    public static boolean isPrime(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
