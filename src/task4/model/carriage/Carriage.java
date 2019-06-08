package task4.model.carriage;

import java.util.List;

/**
 * This class describes carriage.
 *
 * @author      Steven Altamirano
 */
public class Carriage {
    private int id;
    private List<Carriage> listOfCarriages;

    public Carriage(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setListOfCarriages(List<Carriage> listOfCarriages) {
        this.listOfCarriages = listOfCarriages;
    }

    public List<Carriage> getListOfCarriages() {
        return listOfCarriages;
    }

    public String toString() {
        return ("Carriage #" + id);
    }
}
