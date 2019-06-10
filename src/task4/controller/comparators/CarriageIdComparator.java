package task4.controller.comparators;

import task4.model.carriage.PassengerCarriage;

import java.util.Comparator;

public class CarriageIdComparator implements Comparator<PassengerCarriage> {
    @Override
    public int compare(PassengerCarriage p1, PassengerCarriage p2) {
        if (p1.getId() > p2.getId()) {
            return 1;
        } else if (p1.getId() == p2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
