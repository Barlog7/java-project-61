package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static final String NUMBER_GREET = "1";
    public static final String NUMBER_EVEN = "2";
    public static final String NUMBER_CALC = "3";
    public static final String NUMBER_GCD = "4";
    public static final String NUMBER_PROGRESSION = "5";
    public static final String NUMBER_PRIME = "6";

    public static void main(String[] args) {
        String sExit = "0";
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice:");
        Scanner scannerApp = new Scanner(System.in);
        String userChoice = scannerApp.next();
        System.out.println(" ");
        System.out.println("Welcome to the Brain Games!");
        switch (userChoice) {
            case NUMBER_GREET:
                Cli.greetings();
                break;
            case NUMBER_EVEN:
                Even.game(scannerApp);
                break;
            case NUMBER_CALC:
                Calc.game(scannerApp);
                break;
            case NUMBER_GCD:
                GCD.game(scannerApp);
                break;
            case NUMBER_PROGRESSION:
                Progression.game(scannerApp);
                break;
            case NUMBER_PRIME:
                Prime.game(scannerApp);
                break;
            default:
                break;
        }
        scannerApp.close();
    }
}
