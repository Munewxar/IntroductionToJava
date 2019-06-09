package task4.model.carriage;

import java.util.List;

/**
 * This class describes carriage.
 *
 * @author      Steven Altamirano
 */
public class Carriage {
    private int id;

    public Carriage(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return ("Carriage #" + id);
    }
}
