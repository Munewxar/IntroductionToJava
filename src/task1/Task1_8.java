package task1;

public class Task1_8 {

    public static void trianlgeCheck(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x1 == x2 && y1 == y2 || x1 == x3 && y1 == y3 || x2 == x3 && y2 == y3) {
            System.out.println("It is not a triangle!");
        } else {
            int ab = (int) Math.sqrt( (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1- y2));
            int bc = (int) Math.sqrt( (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2- y3));
            int ac = (int) Math.sqrt( (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1- y3));

            if (Math.pow(ab, 2) == Math.pow(bc, 2) + Math.pow(ac, 2) ||
                    Math.pow(bc, 2) == Math.pow(ab, 2) + Math.pow(ac, 2) ||
                    Math.pow(ac, 2) == Math.pow(bc, 2) + Math.pow(ab, 2)) {
                System.out.println("It is a right triangle!");
                return;
            }
        }
        System.out.println("It is a triangle!");
    }

}
