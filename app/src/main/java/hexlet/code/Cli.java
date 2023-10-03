package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static String hello(Scanner sc) {
        //Scanner scannerC = new Scanner(System.in);

        //System.out.println("Hello, world!");
        System.out.print("What is your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        //scannerC.close();
        return userName;
    }
}
