package lesson9;

public final class Car extends Automobile {

    public Car(String model) {
        super(model);
    }

    @Override
    protected void move(int distance) {
        int maxDistance = 500;
        if (distance <= maxDistance) {
            System.out.println("Легковой " + this + " проехал " + distance + " км.");
        } else {
            System.out.println("Легковой " + this + " не может проехать " + distance + " км без дозаправки.");
        }
    }
}
