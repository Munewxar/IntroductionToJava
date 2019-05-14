package task2;

/**
 * @author      Steven Altamirano
 */
public class Task2_3 {
    /**
     * This method checks whether number is perfect
     * @param n number we will check
     * @author      Steven Altamirano
     */
    public static void isPerfect(int n) {
        int dividersSum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                dividersSum += i;
            }
        }

        if (dividersSum == n) {
            System.out.println("Oh my god! This number is perfect!");
        } else {
            System.out.println("God NO! This number isn' t prefect!");
        }
    }
}
