package lesson11;

public class Checking {
    public static void speedControl(String number, int speed) throws MyException{
        if ((speed > 80) && (speed <= 100)){
            throw new MyException("Внимание! Автомобиль с номером " + number + " снижайте скорость!");
        }

        if (speed > 100){
            throw new MyException("Полиция начала погоню за автомобилем с номером " + number);
        }
    }

    public static void weightControl(String number, double weight) throws MyException{
        if (weight > 8){
            throw new MyException("Превышение допустимой массы, автомобилю с номером " + number + " проезд запрещен!");
        }
    }

    public static void dimensionsControl(String number, double length, double width, double height) throws MyException{
        if ((length > 4) || (height > 2.5)){
            throw new MyException("Превышение габаритов, автомобилю с номером " + number + " проезд запрещен!");
        }
    }
}
