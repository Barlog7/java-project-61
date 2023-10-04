package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static String startMessage = "What is the result of the expression?";

    //private static String messegeAQ = "Question: ";


    public static int gameround(String nameUser, Scanner sc) {
        int i = 0;
        int ranNumber1 = Engine.getnumrandom();
        int ranNumber2 = Engine.getnumrandom();
        //int sum = ranNumber1 + ranNumber2;
        String sign = getnumrandomSign();
        int resultNumber = resultFormula(ranNumber1, ranNumber2, sign);
        String anser = String.valueOf(resultNumber);
        //String formula = ranNumber1 + sign + ranNumber2;
        String messQ = ranNumber1 + sign + ranNumber2;
        Engine.messageQ(messQ);
        //System.out.println(messQ);
        String userAnser = sc.next();
        Engine.messageA(userAnser);
        if (anser.equals(userAnser)) {
            i = 1;
            Engine.messageCorr();
        } else {
            Engine.messageErr(userAnser, anser, nameUser);
        }
        return i;

    }
    public static String getStartMessage() {
        return startMessage;
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
