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

    public int getAmountOfPassengers() {
        return passengersList.size();
    }

    public int getAmountOfPassengersWithLuggage() {
        int amount = 0;

        for (int i = 0; i < passengersList.size(); i++) {
            if (passengersList.get(i).haveLuggage()) {
                amount += 1;
            }
        }

        return amount;
    }

    public List<Passenger> getPassengersList() {
        return passengersList;
    }
}
