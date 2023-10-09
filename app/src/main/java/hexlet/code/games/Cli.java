package hexlet.code.games;

import java.util.Scanner;
public class Cli {
    public static String hello(Scanner sc) {

        System.out.print("What is your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");


        return userName;
    }
}
