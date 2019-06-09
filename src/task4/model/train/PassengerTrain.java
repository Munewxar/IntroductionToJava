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

    public PassengerTrain(String id, List<PassengerCarriage> carriagesList) {
        super(id);
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getId());
        stringBuilder.append("\n");
        for (int i = 0; i < carriagesList.size(); i++) {
            stringBuilder.append(carriagesList.get(i).getId());
            stringBuilder.append("\n");

            for (int j = 0; j < carriagesList.get(i).getPassengersList().size(); j++) {
                stringBuilder.append(carriagesList.get(i).getPassengersList().get(j).getName());
                stringBuilder.append("\t");
            }

            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
