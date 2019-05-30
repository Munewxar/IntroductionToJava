package task4.controller;

import task4.model.train.Train;

public class Counter {

    public static int countPassengersAmount(Train train) {
        int passengersAmount = 0;

        for (int i = 0; i < train.getCarriageList().size(); i++) {
            passengersAmount += train.getCarriageList().get(i).
                                                        getPassengersList().
                                                        size();
        }

        return passengersAmount;
    }

    public static int countLuggageAmount(Train train) {
        int luggageAmount = 0;

        for (int i = 0; i < train.getCarriageList().size(); i++) {
            int passengersAmount = train.getCarriageList().get(i).getPassengersList().size();

            for (int j = 0; j < passengersAmount; j++) {
                luggageAmount += train.getCarriageList().get(i).
                        getPassengersList().get(j).haveLuggage();
            }
        }

        return luggageAmount;
    }
}
