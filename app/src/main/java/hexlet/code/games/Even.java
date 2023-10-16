package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    private static final  String STARTMESSAGE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void play(Scanner sc) {
        String[][] arrQuestionAnswer = new String[Engine.COUNTGAMES][Engine.COUNTARRAYCOLUMN];
        for (int i = 0; i < arrQuestionAnswer.length; i++) {
            int numberQuestion = Utils.getNumRandom();
            arrQuestionAnswer[i][0] = String.valueOf(numberQuestion);
            arrQuestionAnswer[i][1] = checkNumberEven(numberQuestion);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

    }

    public static String checkNumberEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }


}

