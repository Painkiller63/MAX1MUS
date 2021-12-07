package lesson10;

import java.util.Scanner;

public class FarenheitToCelcius implements Converter {

    @Override
    public float convert() {
        float t;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру в Фаренгейтах");
            while (!scanner.hasNextFloat()) {
                System.out.println("Вы ввели не число. Пожалуйста введите число: ");
                scanner.next();
            }
            t = scanner.nextFloat();
        return (float) ((t - 32) * (5.0 / 9.0));
    }
}
