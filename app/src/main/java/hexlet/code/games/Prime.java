package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    private static String startMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static int gameround(String nameUser, Scanner sc) {
        int i = 0;
        int checkNumber = Engine.getnumrandom();

        String messQ = String.valueOf(checkNumber);
        Engine.messageQ(messQ);
        String anser = askSimple(checkNumber);

        String userAnser = sc.next();
        userAnser = userAnser.toLowerCase();
        Engine.messageA(userAnser);
        if (anser.equals(userAnser)) {
            i = 1;
            Engine.messageCorr();
        } else {
            Engine.messageErr(userAnser, anser, nameUser);
        }
        return i;

    }

    public static String askSimple(Integer number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static String getStartMessage() {
        return startMessage;
    }
}
