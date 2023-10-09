package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.enganeGame;


public class Calc {

    public static void game(Scanner sc) {
        String startMessage = "What is the result of the expression?";
        String[] arrQuestion = new String[3];
        String[] arrAnswer = new String[3];
        for (int i = 0; i < arrQuestion.length; i++) {
            int ranNumber1 = Engine.getnumrandom();
            int ranNumber2 = Engine.getnumrandom();
            String sign = getnumrandomSign();
            int resultNumber = resultFormula(ranNumber1, ranNumber2, sign);
            arrQuestion[i] = ranNumber1 + sign + ranNumber2;
            arrAnswer[i] = String.valueOf(resultNumber);
        }
        enganeGame(sc, startMessage, arrQuestion, arrAnswer);

    }


    public static String getnumrandomSign() {
        Random random = new Random();
        int ranNumber = random.nextInt(3);
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
