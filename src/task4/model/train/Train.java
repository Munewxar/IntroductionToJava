package task4.model.train;

import java.util.List;

/**
 * This class describes train.
 *
 * @author      Steven Altamirano
 */
public class Train {
    private String id;
    private List<Locomotive> locomotiveList;

    public Train(String id, List<Locomotive> locomotiveList) {
        this.id = id;
        this.locomotiveList = locomotiveList;
    }

    public String getId() {
        return id;
    }

    public List<Locomotive> getLocomotiveList() {
        return locomotiveList;
    }

    public String toString() {
        return ("Train " + id);
    }
}
