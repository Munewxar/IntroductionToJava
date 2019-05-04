package task1;

public class Task1_5 {
    public static void avg (Integer number) {
        String [] digits = number.toString().split("");
        double arithmeticMean = 0;
        double geometricMean = 1;

        for (int i = 0; i < digits.length; i++) {
            arithmeticMean += Double.parseDouble(digits[i]);
            geometricMean *= Double.parseDouble(digits[i]);
        }

        arithmeticMean = arithmeticMean / digits.length;
        geometricMean = Math.pow(geometricMean, 1.0d / digits.length);

        System.out.println("Arithmetic mean = " + arithmeticMean +
                "\nGeometric mean = " + geometricMean);
    }
}
