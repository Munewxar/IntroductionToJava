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

    public Passenger(String paramString) {
        String[] params = paramString.split(" ");
        name = params[0];
        try {
            age = Integer.valueOf(params[1]);
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        luggage = params[2].equals("есть");
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
