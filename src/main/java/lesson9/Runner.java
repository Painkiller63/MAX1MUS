package lesson9;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes");
        Car car2 = new Car("BMW");
        Truck truck1 = new Truck("Volvo");
        Truck truck2 = new Truck("DAF");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("KIA");
        Truck truck3 = new Truck("MAN");
        Truck truck4 = new Truck("Renault");
        Car car5 = new Car("Hyundai");
        Truck truck5 = new Truck("Mercedes-Benz");

        Automobile[] automobiles = {car1, car2, truck1, truck2, car3, car4, truck3, truck4, car5, truck5};
        int distance = 0;
        for (int i = 0; i < 10; i++) {
            distance += 100;
            automobiles[i].move(distance);
        }
    }
}