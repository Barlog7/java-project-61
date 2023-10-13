package hexlet.code;

import java.util.Scanner;

public class Engine {


    private static String messegeQ = "Question: ";
    private static String messegeA = "Your answer: ";
    private static String messegeCorr = "Correct!";


    public static void runGame(Scanner sc, String startText, String[][] arrQuestionAnswer) {
        //String userName = Cli.greetings(sc);
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(startText);
        final int countGames = 3;
        for (int i = 0; i < countGames; i++) {
            String anser = arrQuestionAnswer[i][1];
            String textQestion = arrQuestionAnswer[i][0];
            System.out.println(messegeQ + textQestion);
            //Engine.messageQ(textQestion);
            System.out.print(messegeA);
            //Engine.messageA();
            String userAnser = sc.next().toLowerCase();
            if (anser.equals(userAnser)) {
                //Engine.messageCorr();
                System.out.println(messegeCorr);
            } else {
                //Engine.messageErr(userAnser, anser, userName);
                System.out.println("'" + userAnser + "' is wrong answer ;(. Correct answer was '" + anser + "'.\n"
                        + "                    Let's try again, " + userName + "!");
                return;
            }
        }
        Engine.endMessage(userName);
    }

    private static void endMessage(String nameUser) {
        System.out.println("Congratulations, " + nameUser + "!");
    }



    /*public static void messageQ(String strMessage) {
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
    }*/
    /*public static int getNumRrandom() {
        Random random = new Random();
        final int numberMax = 100;
        int ranNumber = random.nextInt(numberMax);
        return ranNumber;
    }
    public static int getNumRrandom(int maxnamber) {
        Random random = new Random();
        int ranNumber = random.nextInt(maxnamber) + 1;
        return ranNumber;
    }*/
}
