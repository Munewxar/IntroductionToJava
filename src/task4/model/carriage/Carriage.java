package task4.model.carriage;

import task4.model.passenger.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describes carriage.
 *
 * @author      Steven Altamirano
 */
public class Carriage {
    private int weight;
    private int length;
    private List<Person> passengersList = new ArrayList<>();

    public Carriage(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public List<Person> getPassengersList() {
        return passengersList;
    }
}
