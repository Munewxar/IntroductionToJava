package task4.model.passenger;

/**
 * This class describes passenger.
 *
 * @author      Steven Altamirano
 */
public class Passenger {
    private String name;
    private int age;
    private boolean luggage;

    public Passenger(String name, int age, boolean luggage) {
        this.name = name;
        this.age = age;
        this.luggage = luggage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean haveLuggage() {
        return luggage;
    }

    public String toString() {
        return ("Passenger " + name);
    }
}
