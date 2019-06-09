package task4.model.train;

/**
 * This class describes train.
 *
 * @author      Steven Altamirano
 */
public class Train {
    private String id;

    public Train(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return ("Train " + id);
    }
}
