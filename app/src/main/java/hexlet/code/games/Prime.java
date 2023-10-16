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
            arrQuestionAnswer[i][1] = askSimple(checkNumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

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
