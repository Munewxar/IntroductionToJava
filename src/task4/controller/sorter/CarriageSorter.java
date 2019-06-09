package task4.controller.sorter;

import task4.controller.comparators.LuggageAmountComparator;
import task4.controller.comparators.PassengersAmountComparator;
import task4.model.carriage.PassengerCarriage;
import task4.model.train.PassengerTrain;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * This class created to sort carriages.
 *
 * @author      Steven Altamirano
 */
public class PassengerCarriageSorter {

    /**
     * This method creates TreeSet.
     * It means that all carriages will be sorted.
     * Then removes all data from current train's carriages list.
     * Then add all data from TreeSet to current train's carriage list.
     * @param passengerTrain - train in which we will sort carriages
     */
    public static void sort(PassengerTrain passengerTrain) {
        Comparator<PassengerCarriage> pcomp = new PassengersAmountComparator().
                                              thenComparing(new LuggageAmountComparator());
        TreeSet<PassengerCarriage> passengerCarriageTreeSet = new TreeSet(pcomp);

        passengerCarriageTreeSet.addAll(passengerTrain.getCarriagesList());
        passengerTrain.getCarriagesList().clear();
        passengerTrain.getCarriagesList().addAll(passengerCarriageTreeSet);
    }
}
