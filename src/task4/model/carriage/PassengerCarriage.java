package task4.model.carriage;

import task4.model.passenger.Passenger;

import java.util.List;

/**
 * This class describes passenger carriage.
 *
 * @author      Steven Altamirano
 */
public class PassengerCarriage extends Carriage {
    private List<Passenger> passengersList;

    public PassengerCarriage(List<Passenger> passengersList, int id) {
        super(id);
        this.passengersList = passengersList;
    }

    public List<Passenger> getPassengersList() {
        return passengersList;
    }
}
