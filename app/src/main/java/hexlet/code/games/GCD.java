package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;


public class GCD {
    private static final  String STARTMESSAGE = "Find the greatest common divisor of given numbers.";

    public static void play(Scanner sc) {

        String[][] arrQuestionAnswer = new String[Engine.COUNTGAMES][Engine.COUNTARRAYCOLUMN];
        for (int i = 0; i < arrQuestionAnswer.length; i++) {
            int ranNumber1 = Utils.getNumRandom();
            int ranNumber2 = Utils.getNumRandom();
            int resultNumber = getNod(ranNumber1, ranNumber2);
            arrQuestionAnswer[i][0] = ranNumber1 + " " + ranNumber2;
            arrQuestionAnswer[i][1] = String.valueOf(resultNumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

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
