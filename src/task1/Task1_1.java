package task1;

public class Task1_1 {
    public static void equals(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("a = b = c");
        } else if (a == b) {
            System.out.println("a = b");
        } else if (a == c) {
            System.out.println("a = c");
        } else if (b == c) {
            System.out.println("b = c");
        } else {
            System.out.println("a != b != c");
        }
    }
}
