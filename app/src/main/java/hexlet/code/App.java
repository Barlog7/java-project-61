package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String sExit = "0";

        final String sGreet = "1";
        final String sEven = "2";
        final String sCalc = "3";
        final String sGCD = "4";
        final String sProgression = "5";
        final String sPrime = "6";

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

        String nameUser = "";
        if (!userChoice.equals(sExit)) {

            System.out.println("Welcome to the Brain Games!");
            switch (userChoice) {
                case sGreet:
                    Cli.hello(scannerApp);
                    break;
                case sEven :
                    Even.game(scannerApp);
                    break;
                case sCalc :
                    Calc.game(scannerApp);
                    break;
                case sGCD :
                    GCD.game(scannerApp);
                    break;
                case sProgression :
                    Progression.game(scannerApp);
                    break;
                case sPrime :
                    Prime.game(scannerApp);
                    break;
                default:
                    break;
            }

        }

        scannerApp.close();

    }

}
