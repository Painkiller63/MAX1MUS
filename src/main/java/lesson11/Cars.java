package lesson11;

public class Cars extends Automobile {


    public Cars(String number, int speed, double weight, double length, double width, double height) {
        super(number, speed, weight, length, width, height);
    }

    @Override
    protected void drive(Automobile car) {
        System.out.println("Легковой " + this + " проезжает КПП со скоростью " + speed + " км/ч.");
    }


}