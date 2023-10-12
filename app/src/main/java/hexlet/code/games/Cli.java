package hexlet.code.games;

import java.util.Scanner;
public class Cli {
    public static String greetings() {

        Scanner scannerApp = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scannerApp.next();
        System.out.println("Hello, " + userName + "!");
        scannerApp.close();


        return userName;
    }
}
