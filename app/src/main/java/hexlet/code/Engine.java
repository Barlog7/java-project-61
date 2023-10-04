package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;

import java.util.Random;
import java.util.Scanner;

//import static hexlet.code.games.Cli.hello;

public class Engine {
    private static String messegeQ = "Question: ";
    private static String messegeA = "Your answer: ";
    private static String messegeCorr = "Correct!";
    //private static String messegeErr = "Correct!";
    private static int countGames = 3;
    public static void game(String nameUser, Scanner sc, String userChoice) {
        //startMessege(GameRound.startMessage);
        int result = 0;
        for (int i = 1; i <= countGames; i++) {
            switch (userChoice) {
                case "1" :
                    Cli.hello(sc);
                    break;
                case "2" :
                    startMessege(Even.getStartMessage());
                    result = Even.gameround(nameUser, sc);
                    break;
                case "3" :
                    startMessege(Calc.getStartMessage());
                    result = Calc.gameround(nameUser, sc);
                    break;
                default:
                    break;
            }
            //result = gameR.gameround(nameUser, sc);
            //countGames++;
            //resultMessage(result, nameUser);
            if (result == 0) {
                return;
            }
        }
        endMessage(nameUser);
    }

    private static void endMessage(String nameUser) {
        System.out.println("Congratulations, " + nameUser + "!");
    }


    public static void startMessege(String strMessage) {
        System.out.println(strMessage);
    }
    public static void messageQ(String strMessage) {
        System.out.println(messegeQ + strMessage);
    }
    public static void messageA(String strMessage) {
        System.out.println(messegeA + strMessage);
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
        int ranNumber = random.nextInt(100);
        return ranNumber;
    }
}
