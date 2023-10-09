package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.enganeGame;


public class GCD {

    public static void game(Scanner sc) {

        String startMessage = "Find the greatest common divisor of given numbers.";
        String[] arrQuestion = new String[3];
        String[] arrAnswer = new String[3];
        for (int i = 0; i < arrQuestion.length; i++) {
            int ranNumber1 = Engine.getnumrandom();
            int ranNumber2 = Engine.getnumrandom();

            int resultNumber = getNod(ranNumber1, ranNumber2);
            arrQuestion[i] = ranNumber1 + " " + ranNumber2;
            arrAnswer[i] = String.valueOf(resultNumber);
        }
        enganeGame(sc, startMessage, arrQuestion, arrAnswer);

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
