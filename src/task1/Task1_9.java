package task1;

public class Task1_9 {
    public static void dragonEyesAndHeads(int age) {
        long eyes;
        long heads = 3;

        if (age <= 0) {
            System.out.println("Wrong age!");
            return;
        }

        if (age <= 200) {
            heads += age * 3;
        } else if (age < 300) {
            heads += (age - 200) * 2 + 600;
        } else {
            heads += (age - 300) + 200 + 600;
        }

        eyes = heads * 2;

        System.out.println("Dragon have: " + heads + " heads and " +
                + eyes + " eyes.");
    }
}
