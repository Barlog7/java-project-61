package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.runGame;


public class Calc {

    public static void game(Scanner sc) {
        final int countGames = 3;
        String startMessage = "What is the result of the expression?";
        String[] arrQuestion = new String[countGames];
        String[] arrAnswer = new String[countGames];
        for (int i = 0; i < arrQuestion.length; i++) {
            int ranNumber1 = Engine.getnumrandom();
            int ranNumber2 = Engine.getnumrandom();
            String sign = getnumrandomSign();
            int resultNumber = resultFormula(ranNumber1, ranNumber2, sign);
            arrQuestion[i] = ranNumber1 + " " + sign + " " + ranNumber2;
            arrAnswer[i] = String.valueOf(resultNumber);
        }
        runGame(sc, startMessage, arrQuestion, arrAnswer);

    }


    public static String getnumrandomSign() {
        Random random = new Random();
        final int countSign = 3;
        int ranNumber = random.nextInt(countSign);
        if (ranNumber == 0) {
            return "+";
        } else if (ranNumber == 1) {
            return "-";
        } else {
            return "*";
        }
    }
    public static int resultFormula(int number1, int number2, String sign) {
        if (sign.equals("+")) {
            return number1 + number2;
        } else if (sign.equals("-")) {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }


}
