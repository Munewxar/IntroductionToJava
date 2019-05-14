package task2;

/**
 * @author      Steven Altamirano
 */
public class Task2_4 {
    /**
     * This method finds all friend numbers in a preset range
     * @param begin start of range
     * @param end end of range
     */
    public static void findFriendNumbers(int begin, int end) {
        int firstNumber;
        int secondNumber;

        for (int i = begin; i < end; i++) {
            firstNumber = i;
            secondNumber = getSumOfDividers(firstNumber);

            if (getSumOfDividers(firstNumber) == secondNumber &&
                    getSumOfDividers(secondNumber) == firstNumber &&
                    secondNumber < end &&
                    firstNumber != secondNumber) {

                System.out.println(firstNumber + " " + secondNumber);
            }
        }
    }

    /**
     * This method counts sum of dividers for n
     * @param n for this number we will count sum of dividers
     * @return sum of dividers
     */
    private static int getSumOfDividers(int n) {
        int sumOfDividers = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDividers += i;
            }
        }

        return sumOfDividers;
    }
}
