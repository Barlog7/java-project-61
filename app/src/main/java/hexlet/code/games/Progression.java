package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;

import hexlet.code.Utils;


public class Progression {
    private static final  String STARTMESSAGE = "What number is missing in the progression?";
    public static void game(Scanner sc) {
        final int countGames = 3;
        final int changeProgressionStepMax = 10;
        final int minLength = 5;
        final int maxLength = 5;

        String[] arrQuestion = new String[countGames];
        String[] arrAnswer = new String[countGames];
        for (int i = 0; i < arrQuestion.length; i++) {

            int startNumber = Utils.getNumRandom();
            int progressionNumber = Utils.getNumRandom(changeProgressionStepMax);
            int progressionLength = minLength + Utils.getNumRandom(maxLength);
            int hidenumberPoz = Utils.getNumRandom(progressionLength);
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
        runGame(sc, STARTMESSAGE, arrQuestion, arrAnswer);

    }


}
