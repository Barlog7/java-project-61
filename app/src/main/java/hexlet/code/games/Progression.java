package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static String startMessage = "What number is missing in the progression?";

    public static int gameround(String nameUser, Scanner sc) {
        int i = 0;
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
        String messQ = result.toString();
        Engine.messageQ(messQ);
        String anser = String.valueOf(hidenumber);

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
    public static String getStartMessage() {
        return startMessage;
    }
}
