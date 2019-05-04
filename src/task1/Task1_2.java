package task1;

public class Task1_2 {
    public static void quantities (int kg) {
        long g = kg * 1000;
        long mg = g * 1000;
        double t = (double) kg / 1000;

        System.out.printf("g = %d%nmg = %d%nt = %f%n", g, mg, t);
    }
}
