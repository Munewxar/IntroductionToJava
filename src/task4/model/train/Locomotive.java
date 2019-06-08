package task4.model.train;

/**
 * This class describes locomotive.
 *
 * @author      Steven Altamirano
 */
public class Locomotive {
    private int id;

    public Locomotive(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return ("Locomotive #" + id);
    }
}
