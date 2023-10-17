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
            int[] arrProgression = createProgression(startNumber, progressionNumber, progressionLength);
            hidenumber = arrProgression[hidenumberPoz - 1];
            String anser = bildStringProgression(arrProgression, hidenumberPoz);
            arrQuestionAnswer[i][0] = anser;
            arrQuestionAnswer[i][1] =  String.valueOf(hidenumber);
        }
        runGame(sc, STARTMESSAGE, arrQuestionAnswer);

    }
    public static String bildStringProgression(int[] arrProgression, int hidenumberPoz) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrProgression.length; i++) {
            String elementProgression = i == (hidenumberPoz - 1) ? ".. " : arrProgression[i] + " ";
            result.append(elementProgression);
        }
        return result.toString();
    }

    public static int[] createProgression(int startNumber, int progressionNumber, int progressionLength) {
        int[] arrProgression = new int[progressionLength];
        for (int j = 0; j < progressionLength; j++) {
            arrProgression[j] = startNumber;
            startNumber += progressionNumber;
        }
        return arrProgression;
    }


}
