package hexlet.code;

import hexlet.code.games.Cli;
//import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String sGreet = "1";
        String sEven = "2";
        String sCalc = "3";
        String sGCD = "4";
        String sProgression = "5";
        String sExit = "0";

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        Scanner scannerApp = new Scanner(System.in);
        String userChoice = scannerApp.next();
        //scannerApp.close();
        System.out.println("Your choice:" + userChoice);
        String nameUser = "";
        if (!userChoice.equals(sExit)) {
            nameUser = Cli.hello(scannerApp);
            Engine.game(nameUser, scannerApp, userChoice);
        }

        /*if (userChoice.equals(sGreet)) {
            System.out.println("Welcome to the Brain Games!");
            Cli.hello(scannerApp);
        } else if (userChoice.equals(sEven)) {
            nameUser = Cli.hello(scannerApp);
            Even.game(nameUser, scannerApp);
        }*/

        scannerApp.close();
        /*else {
            return;
        }*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();*/


    }

}
