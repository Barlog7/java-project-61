package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Utils;

import static hexlet.code.Engine.runGame;


public class Calc {
    private static final  String STARTMESSAGE = "What is the result of the expression?";
    public static void game(Scanner sc) {
        final int countGames = 3;
        final int countArrayColumn = 2;

        //String[] arrQuestion = new String[countGames];
        //String[] arrAnswer = new String[countGames];
        String[][] arrQuestionAnswer = new String[countGames][countArrayColumn];
        for (int i = 0; i < arrQuestionAnswer.length; i++) {
            int ranNumber1 = Utils.getNumRandom();
            int ranNumber2 = Utils.getNumRandom();
            String sign = getnumrandomSign();
            int resultNumber = calculate(ranNumber1, ranNumber2, sign);
            //arrQuestion[i] = ranNumber1 + " " + sign + " " + ranNumber2;
            //arrAnswer[i] = String.valueOf(resultNumber);
            arrQuestionAnswer[i][0] = ranNumber1 + " " + sign + " " + ranNumber2;
            arrQuestionAnswer[i][1] = String.valueOf(resultNumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

    }

    public static String getnumrandomSign() {
        final int countSign = 3;
        int ranNumber = Utils.getNumRandom(countSign);
        if (ranNumber == 0) {
            return "+";
        } else if (ranNumber == 1) {
            return "-";
        } else {
            return "*";
        }
    }
    public static int calculate(int number1, int number2, String sign) {
/*        if (sign.equals("+")) {
            return number1 + number2;
        } else if (sign.equals("-")) {
            return number1 - number2;
        } else {
            return number1 * number2;
        }*/
        switch (sign) {
            case "+":
                return number1 + number2;
            case  "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
                /*throw new Exception("Для оператора " + sign +
                        " не определена логика");*/

        }
    }


}
