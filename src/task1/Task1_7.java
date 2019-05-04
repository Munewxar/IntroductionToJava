package task1;

public class Task1_7 {
    public static void swap (int a, int b) {
        a += b;
        b = a - b;
        a = a - b;
        System.out.println(a + "\n" + b);
    }
}
