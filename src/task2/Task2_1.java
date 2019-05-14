package task2;

import java.util.Random;

/**
 * @author Steven Altamirano
 */
public class Task2_1 {
    /**
     * This method imitates 100 coin throws and
     * counts how many times will fall out whether heads or trails.
     * Then prints the result.
     * @author      Steven Altamirano
     */
    public static void throwCoin() {
        int headsCounter = 0;
        int trailsCounter = 0;

        for (int i = 0; i < 1000; i++) {
            if (new Random().nextInt(2) + 1 == 1) {           // 1 = heads, 2 = trails
                headsCounter++;
            } else {
                trailsCounter++;
            }
        }

        System.out.println("Heads = " + headsCounter + "\nTrails = " + trailsCounter);
    }
}
