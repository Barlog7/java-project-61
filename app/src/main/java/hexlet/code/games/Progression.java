package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.runGame;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final  String STARTMESSAGE = "What number is missing in the progression?";
    public static void play(Scanner sc) {

        final int changeProgressionStepMax = 10;
        final int minLength = 5;
        final int maxLength = 5;

        String[][] arrQuestionAnswer = new String[Engine.COUNTGAMES][Engine.COUNTARRAYCOLUMN];
        for (int i = 0; i < arrQuestionAnswer.length; i++) {
            int startNumber = Utils.getNumRandom();
            int progressionNumber = Utils.getNumRandom(changeProgressionStepMax);
            int progressionLength = minLength + Utils.getNumRandom(maxLength);
            int hidenumberPoz = Utils.getNumRandom(progressionLength);
            int hidenumber = 0;
            String[] arrProgression = createProgression(startNumber, progressionNumber, progressionLength);
            hidenumber = Integer.parseInt(arrProgression[hidenumberPoz - 1]);
            arrProgression[hidenumberPoz - 1] = "..";
            String anser = String.join(" ", arrProgression);

            arrQuestionAnswer[i][0] = anser;
            arrQuestionAnswer[i][1] =  String.valueOf(hidenumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

    }
    public static String[] createProgression(int startNumber, int progressionNumber, int progressionLength) {
        String[] arrProgression = new String[progressionLength];
        for (int j = 0; j < progressionLength; j++) {
            arrProgression[j] = String.valueOf(startNumber);
            startNumber += progressionNumber;
        }
        return arrProgression;
    }


}
