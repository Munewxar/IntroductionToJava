package task4.model.train;

import task4.model.passenger.Person;

public class PassengerTrain extends Train {
    // This means at which side locomotive is located
    private LocoSide locoSide;

    public enum LocoSide{
        LEFT,
        RIGHT
    }

    public PassengerTrain(Person driver, LocoSide locoSide) {
        super(driver);
        this.locoSide = locoSide;
    }
}
