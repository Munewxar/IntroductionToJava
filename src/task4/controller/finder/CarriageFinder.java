package task4.controller.finder;

import task4.model.carriage.PassengerCarriage;
import task4.model.train.PassengerTrain;

import java.util.ArrayList;
import java.util.List;

public class CarriageFinder {

    public static List<PassengerCarriage> findCarriages(int min, int max, PassengerTrain passengerTrain) {

        List<PassengerCarriage> searchResult = new ArrayList<>();

        for (int i = 0; i < passengerTrain.getCarriagesList().size(); i++) {
            if (passengerTrain.getCarriagesList().get(i).getAmountOfPassengers() > min &&
                    passengerTrain.getCarriagesList().get(i).getAmountOfPassengers() < max) {
                searchResult.add(passengerTrain.getCarriagesList().get(i));
            }
        }

        return searchResult;
    }
}
