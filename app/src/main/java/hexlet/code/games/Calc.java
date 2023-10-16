package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.runGame;


public class Calc {
    private static String[] arrSign = {"+", "-", "*"};
    private static final  String STARTMESSAGE = "What is the result of the expression?";
    public static void play(Scanner sc) {
        String[][] arrQuestionAnswer = new String[Engine.COUNTGAMES][Engine.COUNTARRAYCOLUMN];
        for (int i = 0; i < arrQuestionAnswer.length; i++) {
            int ranNumber1 = Utils.getNumRandom();
            int ranNumber2 = Utils.getNumRandom();
            String sign = getnumrandomSign();
            int resultNumber = calculate(ranNumber1, ranNumber2, sign);
            arrQuestionAnswer[i][0] = ranNumber1 + " " + sign + " " + ranNumber2;
            arrQuestionAnswer[i][1] = String.valueOf(resultNumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

    }

    public static String getnumrandomSign() {
        final int countSign = 3;
        int ranNumber = Utils.getNumRandom(countSign);
        return arrSign[ranNumber];
    }
    public static int calculate(int number1, int number2, String sign) {

        switch (sign) {
            case "+":
                return number1 + number2;
            case  "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                throw new RuntimeException("Для оператора " + sign + " не определена логика");
        }
    }


}
