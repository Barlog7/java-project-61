package hexlet.code.games;
import java.util.Scanner;
//import java.util.Random;

import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getnumrandom;

public class Even {
    private static final  String STARTMESSAGE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void game(Scanner sc) {
        final int countGames = 3;

        String[] arrQuestion = new String[countGames];
        String[] arrAnswer = new String[countGames];
        for (int i = 0; i < arrQuestion.length; i++) {
            int numberQuestion = getnumrandom();
            arrQuestion[i] = String.valueOf(numberQuestion);
            arrAnswer[i] = checkNumberEven(numberQuestion);
        }
        runGame(sc, STARTMESSAGE, arrQuestion, arrAnswer);

    }

    public static String checkNumberEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }


}

