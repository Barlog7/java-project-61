package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.enganeGame;


public class Progression {
    public static void game(Scanner sc) {
        //int countGames = 3;
        String startMessage =  "What number is missing in the progression?";
        String[] arrQuestion = new String[3];
        String[] arrAnswer = new String[3];
        for (int i = 0; i < arrQuestion.length; i++) {

            int startNumber = Engine.getnumrandom();
            int progressionNumber = Engine.getnumrandom(10);
            int progressionLength = 5 + Engine.getnumrandom(5);
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
        enganeGame(sc, startMessage, arrQuestion, arrAnswer);

    }


}
