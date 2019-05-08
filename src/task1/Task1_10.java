package task1;

public class Task1_10 {
    public static void regExCheck(String letter) {
        if (letter.matches("^[aeiouAEIOU]$")) {
            System.out.println("Vowel!");
        } else {
            System.out.println("Not a vowel!");
        }
    }

    public static void ifCheck(String letter) {
        if (letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")) {
            System.out.println("Vowel!");
        } else {
            System.out.println("Not a vowel!");
        }
    }

    public static void indexOfCheck(String letter) {
        if ("aeiouAEIOU".indexOf(letter) < 0) {
            System.out.println("Not a vowel!");
        } else {
            System.out.println("Vowel!");
        }
    }

    public static void containOrNotCheck(String letter) {
        if (!"aeiouAEIOU".contains(letter)) {
            System.out.println("Not a vowel!");
        } else {
            System.out.println("Vowel!");
        }
    }
}
