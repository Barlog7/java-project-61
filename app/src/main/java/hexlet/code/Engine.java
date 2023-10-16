package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static String messegeQ = "Question: ";
    private static String messegeA = "Your answer: ";
    private static String messegeCorr = "Correct!";
    public static final int COUNTGAMES = 3;
    public static final int COUNTARRAYCOLUMN = 2;

    public static void runGame(Scanner sc, String startText, String[][] arrQuestionAnswer) {
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(startText);
        final int countGames = 3;
        for (int i = 0; i < countGames; i++) {
            String anser = arrQuestionAnswer[i][1];
            String textQestion = arrQuestionAnswer[i][0];
            System.out.println(messegeQ + textQestion);
            System.out.print(messegeA);
            String userAnser = sc.next().toLowerCase();
            if (anser.equals(userAnser)) {
                System.out.println(messegeCorr);
            } else {
                System.out.println("'" + userAnser + "' is wrong answer ;(. Correct answer was '" + anser + "'.\n"
                        + "                    Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
