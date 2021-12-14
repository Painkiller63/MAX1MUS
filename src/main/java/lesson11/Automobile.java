package lesson11;

public abstract class Automobile {
    final String number;
    final int speed;
    final double weight;
    final double length;
    final double width;
    final double height;

    public Automobile (String number, int speed, double weight, double length, double width, double height){
        this.number = number;
        this.speed = speed;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    abstract void drive(Automobile car);

    @Override
    public String toString() {
        return "автомобиль с номером " + number;
    }
}
