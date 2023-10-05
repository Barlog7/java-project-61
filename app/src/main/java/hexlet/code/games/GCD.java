package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    private static String startMessage = "Find the greatest common divisor of given numbers.";

    public static int gameround(String nameUser, Scanner sc) {
        int i = 0;
        int ranNumber1 = Engine.getnumrandom();
        int ranNumber2 = Engine.getnumrandom();
        //int sum = ranNumber1 + ranNumber2;
        //String sign = getnumrandomSign();
        int resultNumber = getNod(ranNumber1, ranNumber2);

        String anser = String.valueOf(resultNumber);
        //String formula = ranNumber1 + sign + ranNumber2;
        String messQ = ranNumber1 + " " + ranNumber2;
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

    public static String getStartMessage() {
        return startMessage;
    }
}
