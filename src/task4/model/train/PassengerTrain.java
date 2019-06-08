package task4.model.train;

import task4.model.carriage.PassengerCarriage;
import java.util.List;

/**
 * This class describes passenger train.
 *
 * @author      Steven Altamirano
 */
public class PassengerTrain extends Train {
    private List<PassengerCarriage> carriagesList;

    public PassengerTrain(String id, List<Locomotive> locomotiveList,
                          List<PassengerCarriage> carriagesList) {
        super(id, locomotiveList);
        this.carriagesList = carriagesList;
    }

    public int getAmountOfPassengers() {
        int amount = 0;

        for (int i = 0; i < carriagesList.size(); i++) {
            amount += carriagesList.get(i).getAmountOfPassengers();
        }

        return amount;
    }

    public int getAmountOfLuggage() {
        int amount = 0;

        for (int i = 0; i < carriagesList.size(); i++) {
            amount += carriagesList.get(i).getAmountOfPassengersWithLuggage();
        }

        return amount;
    }

    public List<PassengerCarriage> getCarriagesList() {
        return carriagesList;
    }
}
