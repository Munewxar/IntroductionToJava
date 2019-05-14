package task2;

/**
 *  @version        1.0
 *  @author         Steven Altamirano
 */
public class Task2_2 {

    /**
     * This method finds biggest digit in some natural number.
     * @param n natural number
     * @author      Steven Altamirano
     */
    public static void findBiggestDigit(long n) {
        int maxDigit = 0;
        int currentDigit;

        for (long i = 10; i < (n * 10); i *= 10) {
            currentDigit = (int) ((n % i) / (i / 10));
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
        }

        System.out.println("The biggest digit in " + n + " is " + maxDigit);
    }

    /**
     * This method checks is number whether the number is palindrome or not.
     * @param n number we will check
     * @author      Steven Altamirano
     */
    public static void isPalindrome(Integer n) {
        // digits of n
        String[] digits = n.toString().split("");

        // index of last element
        int lastIndex = digits.length - 1;

        for (int i = 0; i < digits.length / 2; i++) {
            if (!digits[i].equals(digits[lastIndex - i])) {
                System.out.println("This number is not a palindrome!");
                return;
            }
        }

        System.out.println("This number is a palindrome!");
    }

    /**
     * This method checks whether this number is simple
     * @param n number we will check
     * @author      Steven Altamirano
     */
    public static boolean isSimple(int n) {
        if (n < 2) {
            System.out.println("This number isn' t simple!");
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 2; i < squareRoot; i++) {
            if (n % i == 0) {
                System.out.println("This number isn' t simple!");
                return false;
            }
        }

        System.out.println("This number is simple!");
        return true;
    }

    /**
     * This methods find all simple dividers for n
     * @param n for this number we will find dividers
     * @author      Steven Altamirano
     */
    public static void findDividers(int n) {
        for (int i = 1; i < n; i++) {
            if ((n % i == 0) && isSimple(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * This method finds NOK and NOD for two numbers
     * @param a first number
     * @param b second number
     * @author      Steven Altamirano
     */
    public static void findNOKandNOD(int a, int b) {
        int nod = 1;
        int nok;

        for (int i = 1; i <= a * b; i++) {
            if ((a % i == 0) && (b % i == 0) && (i > nod)) {
                nod = i;
            }

            if ((i % a == 0) && (i % b == 0)) {
                nok = i;
                System.out.println(nod + "\n" + nok);
                return;
            }
        }
    }

    /**
     * This method count amount of different digits in n
     * @param n natural number
     * @author      Steven Altamirano
     */
    public static void countDifferentDigits(Integer n) {
        StringBuilder differentDigits = new StringBuilder();
        String[] digits = n.toString().split("");

        for (String digit : digits) {
            if (!differentDigits.toString().contains(digit)) {
                differentDigits.append(digit);
            }
        }

        System.out.println("Number of different digits in n = " + differentDigits.length());
    }
}
