package task1;

public class Task1_4 {
    public static void checkNumber (Integer number) {
        String [] digits = number.toString().split("");
        for (int i = 0; i < digits.length - 1; i++) {
            if (Integer.valueOf(digits[i]) > Integer.valueOf(digits[i + 1])) {
                System.out.println("This number does not satisfy the condition!");
                return;
            }
        }
        System.out.println("This number satisfy the condition!");
    }
}
