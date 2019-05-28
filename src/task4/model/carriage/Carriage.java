package task4.model.carriage;

/**
 * This class describes carriage.
 *
 * @author      Steven Altamirano
 */
public class Carriage {
    private int weight;
    private int length;

    public Carriage(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }
}
