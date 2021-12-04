package lesson9;

public abstract class Automobile {
    private final String model;

    public Automobile(String model) {
        this.model = model;
    }

    abstract void move(int distance);

    @Override
    public String toString() {
        return "автомобиль " + model;
    }
}