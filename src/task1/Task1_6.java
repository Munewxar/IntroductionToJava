package task1;

public class Task1_6 {
    public static void reverse (Integer number) {
        String[] digits  = number.toString().split("");
        String reversedNumber = new String();
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedNumber += digits[i];
        }
        System.out.println("Original number : " + number + "\nReversed number: " + reversedNumber);
    }
}
