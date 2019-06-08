package task4.model.train;

import task4.model.carriage.FreightCarriage;

import java.util.List;

/**
 * This class describes freight train.
 *
 * @author      Steven Altamirano
 */
public class FreightTrain extends Train{
    private List<FreightCarriage> carriageList;

    public FreightTrain(String id, List<Locomotive> locomotiveList,
                        List<FreightCarriage> carriageList) {
        super(id, locomotiveList);
        this.carriageList = carriageList;
    }

    public List<FreightCarriage> getCarriageList() {
        return carriageList;
    }
}
