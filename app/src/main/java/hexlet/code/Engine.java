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

}
