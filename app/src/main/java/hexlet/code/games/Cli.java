package hexlet.code.games;

import java.util.Scanner;
public class Cli {
    public static String greetings(Scanner sc) {

        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");


        return userName;
    }
}
