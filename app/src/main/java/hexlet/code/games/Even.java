package hexlet.code.games;
import java.util.Scanner;
//import java.util.Random;

import static hexlet.code.Engine.enganeGame;
import static hexlet.code.Engine.getnumrandom;

public class Even {

    public static void game(Scanner sc) {
        String startMessage = "'yes' if the number is even, otherwise answer 'no'.";
        String[] arrQuestion = new String[3];
        String[] arrAnswer = new String[3];
        for (int i = 0; i < arrQuestion.length; i++) {
            int numberQuestion = getnumrandom();
            arrQuestion[i] = String.valueOf(numberQuestion);
            arrAnswer[i] = checkNumberEven(numberQuestion);
        }
        enganeGame(sc, startMessage, arrQuestion, arrAnswer);

    }

    public static String checkNumberEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }


}

