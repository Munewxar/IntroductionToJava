package task4.model.carriage;

public class FreightCarriage extends Carriage{
    private Cargo cargoType;

    public enum Cargo{
        SEND,
        ROCK,
        IRON
    }

    public FreightCarriage(int id, Cargo cargoType) {
        super(id);
        this. cargoType = cargoType;
    }

    public Cargo getCargoType() {
        return cargoType;
    }
}
