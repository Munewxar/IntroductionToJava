package task4.model.carriage;

import task4.model.passenger.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describes passenger carriage.
 */
public class PassengerCarriage extends Carriage{
    private List<Person> passangers = new ArrayList<>();

    public PassengerCarriage(int weight, int length) {
        super(weight, length);
    }

    public List<Person> getPassangers() {
        return passangers;
    }
}
