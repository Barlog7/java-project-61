package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class Even {
    public static void game(String nameUser, Scanner sc) {
        int countGames = 3;
        int result = 0;
        System.out.println("'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 1; i <= countGames; i++) {
            result = gameround(nameUser, sc);
            //countGames++;
            if (result == 0) {
                return;
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
    public static int gameround(String nameUser, Scanner scround) {
        int i = 0;
        int ranNumber = getnumrandom();
        System.out.println("Question: " + ranNumber);
        String anser = checkNumberEven(ranNumber);
        //Scanner scanner = new Scanner(System.in);
        String userAnser = scround.next();
        //scanner.close();
        userAnser = userAnser.toLowerCase();
        System.out.println("Your answer: " + userAnser);
        if (anser.equals(userAnser)) {
            i = 1;
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnser + "' is wrong answer ;(. Correct answer was '" + anser + "'.\n"
                    + "                    Let's try again, " + nameUser + "!");

        }
        return i;
    }
    public static String checkNumberEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static int getnumrandom() {
        Random random = new Random();
        int ranNumber = random.nextInt(100);
        return ranNumber;
    }
}

