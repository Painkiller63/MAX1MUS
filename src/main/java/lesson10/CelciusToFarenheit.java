package lesson10;

import java.util.Scanner;

public class CelciusToFarenheit implements Converter {

     @Override
    public float convert() {
        float t;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру в Цельсиях:");
            while (!scanner.hasNextFloat()) {
                System.out.println("Вы ввели не число. Пожалуйста введите число: ");
                scanner.next();
            }
            t = scanner.nextFloat();
         return (float) (((9.0 / 5.0) * t) + 32);
     }
}
