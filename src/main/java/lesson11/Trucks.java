package lesson11;

public class Trucks extends Automobile {
    public Trucks(String number, int speed, double weight, double length, double width, double height) {
        super(number, speed, weight, length, width, height);
    }

    @Override
    void drive(Automobile truck) {
        System.out.println("Грузовой " + this + " проезжает КПП со скоростью " + speed + " км/ч.");
    }
}
