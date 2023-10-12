package hexlet.code;

import hexlet.code.games.Cli;


import java.util.Random;
import java.util.Scanner;



public class Engine {


    private static String messegeQ = "Question: ";
    private static String messegeA = "Your answer: ";
    private static String messegeCorr = "Correct!";


    public static void enganeGame(Scanner sc, String startText, String[] arrQuestion, String[] arrAnswer) {
        String userName = Cli.greetings(sc);
        System.out.println(startText);
        final int countGames = 3;
        for (int i = 0; i < countGames; i++) {
            String anser = arrAnswer[i];
            String textQestion = arrQuestion[i];
            Engine.messageQ(textQestion);
            Engine.messageA();
            String userAnser = sc.next().toLowerCase();
            if (anser.equals(userAnser)) {
                Engine.messageCorr();
            } else {
                Engine.messageErr(userAnser, anser, userName);
                return;
            }
        }
        Engine.endMessage(userName);
    }

    private static void endMessage(String nameUser) {
        System.out.println("Congratulations, " + nameUser + "!");
    }



    public static void messageQ(String strMessage) {
        System.out.println(messegeQ + strMessage);
    }
    public static void messageA() {
        System.out.print(messegeA);
    }
    public static void messageCorr() {
        System.out.println(messegeCorr);
    }
    public static void messageErr(String userAnser, String anser, String nameUser) {
        System.out.println("'" + userAnser + "' is wrong answer ;(. Correct answer was '" + anser + "'.\n"
                + "                    Let's try again, " + nameUser + "!");
    }
    public static int getnumrandom() {
        Random random = new Random();
        final int numberMax = 100;
        int ranNumber = random.nextInt(numberMax);
        return ranNumber;
    }
    public static int getnumrandom(int maxnamber) {
        Random random = new Random();
        int ranNumber = random.nextInt(maxnamber) + 1;
        return ranNumber;
    }
}
