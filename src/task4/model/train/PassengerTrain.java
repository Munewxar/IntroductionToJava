package task4.model.train;

import task4.model.passenger.Person;

public class PassengerTrain extends Train {
    private LocoSide locoSide;

    public enum LocoSide{
        LEFT,
        RIDE
    }

    public PassengerTrain(Person driver) {
        super(driver);
    }
}
