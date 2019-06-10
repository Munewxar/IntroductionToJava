package task4.controller.sorter;

import task4.controller.comparators.CarriageIdComparator;
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
public class CarriageSorter {

    /**
     * This method creates TreeSet.
     * It means that all carriages will be sorted.
     * Then removes all data from current train's carriages list.
     * Then add all data from TreeSet to current train's carriage list.
     *
     * It's problem here: if we have two equal objects (means they're have equal amount of
     * passengers and equal amount of passengers with luggage), method addAll
     * @see TreeSet
     * ignores one of these elements (element, which goes second).
     *
     * This bug was fixed (third comparator added).
     * @see CarriageIdComparator
     *
     * @param passengerTrain - train in which we will sort carriages
     */
    public static void sort(PassengerTrain passengerTrain) {
        Comparator<PassengerCarriage> comparator = new PassengersAmountComparator().
                                              thenComparing(new LuggageAmountComparator().
                                                      thenComparing(new CarriageIdComparator()));
        TreeSet<PassengerCarriage> passengerCarriageTreeSet = new TreeSet(comparator);

        passengerCarriageTreeSet.addAll(passengerTrain.getCarriagesList());
        passengerTrain.getCarriagesList().clear();

        passengerTrain.getCarriagesList().addAll(passengerCarriageTreeSet);
    }
}
