package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;


public class Progression {
    public static void game(Scanner sc) {
        final int countGames = 3;
        final int changeProgressionStepMax = 10;
        final int minLength = 5;
        final int maxLength = 5;
        String startMessage =  "What number is missing in the progression?";
        String[] arrQuestion = new String[countGames];
        String[] arrAnswer = new String[countGames];
        for (int i = 0; i < arrQuestion.length; i++) {

            int startNumber = Engine.getnumrandom();
            int progressionNumber = Engine.getnumrandom(changeProgressionStepMax);
            int progressionLength = minLength + Engine.getnumrandom(maxLength);
            int hidenumberPoz = Engine.getnumrandom(progressionLength);
            int hidenumber = 0;
            var result = new StringBuilder();
            for (int j = 1; j <=  progressionLength; j++) {
                if (j == hidenumberPoz) {
                    result.append(".. ");
                    hidenumber = startNumber;
                } else {
                    result.append(startNumber + " ");
                }
                startNumber += progressionNumber;
            }

            arrQuestion[i] = result.toString();
            arrAnswer[i] = String.valueOf(hidenumber);
        }
        runGame(sc, startMessage, arrQuestion, arrAnswer);

    }


}
