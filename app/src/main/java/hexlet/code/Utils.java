package hexlet.code;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    public static int getNumRandom() {
        //Random random = new Random();
        final int numberMax = 100;
        int ranNumber = random.nextInt(numberMax);
        return ranNumber;
    }
    public static int getNumRandom(int maxnamber) {
        //Random random = new Random();
        int ranNumber = random.nextInt(maxnamber) + 1;
        return ranNumber;
    }
}
