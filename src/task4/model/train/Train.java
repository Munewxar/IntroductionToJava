package task4.model.train;

import task4.model.carriage.Carriage;
import task4.model.passenger.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * This class describes train.
 *
 * @author      Steven Altamirano
 */
public class Train {
    private List<Carriage> carriageList = new ArrayList<>();
    private Person driver;

    public Train(Person driver) {
        this.driver = driver;
    }

    public List<Carriage> getCarriageList() {
        return carriageList;
    }

    public Person getDriver() {
        return driver;
    }
}
