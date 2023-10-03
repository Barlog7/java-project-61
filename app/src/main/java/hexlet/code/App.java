package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        String userChoice = scanner.next();
        System.out.println("Your choice:"+ userChoice);
        if (!userChoice.equals("1")) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();*/
        Cli.hello();

    }

}
