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

    public List<PassengerCarriage> getCarriagesList() {
        return carriagesList;
    }
}
