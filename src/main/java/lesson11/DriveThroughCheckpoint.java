package lesson11;

public class DriveThroughCheckpoint {

    public static Cars car;
    public static Trucks truck;

    static void driveCheckpoint(Automobile auto) {
        if (auto.speed <= 80) {
            if (auto.weight <= 8) {
                if (auto.height <= 2.5) {
                    AutoType autoType = AutoType.getAutoType(auto);
                    switch (autoType) {
                        case CARS -> auto.drive(car);
                        case TRUCKS -> auto.drive(truck);
                        default -> throw new IllegalStateException("Unexpected value: " + autoType);
                    }
                } else {
                    try {
                        Checking.dimensionsControl(auto.number, auto.length, auto.width, auto.height);
                    } catch (MyException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    Checking.weightControl(auto.number, auto.weight);
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                Checking.speedControl(auto.number, auto.speed);
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
