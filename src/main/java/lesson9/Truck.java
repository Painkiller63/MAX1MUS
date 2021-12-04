package lesson9;

public final class Truck extends Automobile {

    public Truck(String model) {
        super(model);
    }

    @Override
    protected void move(int distance) {
        int maxDistance = 1200;
        if (distance <= maxDistance) {
            System.out.println("Грузовой " + this + " проехал " + distance + " км.");
        } else {
            System.out.println("Грузовой " + this + " не может проехать " + distance + " км без дозаправки.");
        }
    }
}
