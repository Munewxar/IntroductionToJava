package task1;

public class Task1_11 {
    public static void getNextDay(int day, int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) && day == 30) {
            System.out.println("31." + month + "." + year);
        } else if (day == 31 || day == 30) {
            if (month == 12) {
                year += 1;
                System.out.println("01.01." + year);
            } else {
                month += 1;
                System.out.println("01." + month + "." + year);
            }
        } else if (month == 2 && day == 28) {
            if ((year % 4 == 0 && year % 100 != 0) ||
                    (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
                System.out.println("29.02." + year);
            } else {
                System.out.println("01.03." + year);
            }
        } else {
            day += 1;
            System.out.println(day + "." + month + "." + year);
        }
    }

}
